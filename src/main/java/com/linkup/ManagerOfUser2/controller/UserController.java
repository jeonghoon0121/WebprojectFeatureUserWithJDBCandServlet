package com.linkup.ManagerOfUser2.controller;

import com.linkup.ManagerOfUser2.model.dao.UserDAO;
import com.linkup.ManagerOfUser2.model.dto.UserDTO;
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
        request.setCharacterEncoding("UTF-8");
        userDAO.selectAllCode(con);
    }

}
