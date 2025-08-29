package com.linkup.ManagerOfUser2.controller;

import com.linkup.ManagerOfUser2.model.dao.UserDAO;
import com.linkup.ManagerOfUser2.model.dto.UserDTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import static com.linkup.ManagerOfUser2.common.JDBCTemplate.getConnection;

@WebServlet("/forward")
public class UserController extends HttpServlet {
    UserDAO userDAO=new UserDAO();
    Connection con = getConnection();
    List<UserDTO> userDTOList=new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//       userDAO.selectAllCode(con);
//        userDAO.selectAllCode2(con);
        for(UserDTO userDTO:userDAO.selectAllCode2(con)){
            System.out.println(userDTO.toString());
        }
        List<UserDTO> userDTOList = userDAO.selectAllCode2(con); // DB에서 가져온 리스트를 직접 할당
        request.setAttribute("userDTOList", userDTOList);

        request.setAttribute("userDTOList",userDTOList);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/receive");
        requestDispatcher.forward(request,response);
    }

}
