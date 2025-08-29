package com.linkup.ManagerOfUser2.controller;

import com.linkup.ManagerOfUser2.model.dto.UserDTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/receive")
public class UserControllerReceiver extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<UserDTO> userDTOList=(List<UserDTO>)request.getAttribute("userDTOList");
        request.setAttribute("userDTOList", userDTOList);

        response.setContentType("text/html;charset=UTF-8");

        if(userDTOList !=null){
            for(UserDTO userDTO : userDTOList){
                System.out.println(userDTO.toString());
            }
        }
        else{System.out.println("test3");
            System.out.println("회원정보 없다. ");
        }
        request.setAttribute("userDTOList",userDTOList);

        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view.jsp");
        requestDispatcher.forward(request,response);
    }

}
