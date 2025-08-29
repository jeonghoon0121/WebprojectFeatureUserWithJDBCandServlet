package com.ohgiraffers.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print1")
public class PrintLoginSuccessServlet extends HttpServlet {

    /* forward 받은 서블릿에서도 요청 방식이 get이면 doGet메소드를,
    *  요청 방식이 post이면 doPost메소드를 호출한다.
    *  보내준 서블릿에서 request에 전달 정보를 담아 해당 서블릿에서
    *  사용하기 위해 다시 request에서 꺼낸다.
    * */

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userId = (String) request.getAttribute("userId");

        System.out.println("print servlet userId = " + userId);

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append(userId)
                .append("님 환영합니다.</h3>")
                .append("</body>\n")
                .append("</html>");

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print(responseText);

        out.close();
    }
}

/* 기본적으로 변수의 기본 스코프는 메소드(=해당 페이지)이기 때문에 다른 페이지(=서블릿)로 데이터를 공유할 수 없다.
*  하지만 forward방식은 request와 response를 포함하여 위임하므로 request에 정보를 저장하여 forward하면
*  위임받은 서블릿에서도 위임한 서블릿의 정보를 공유할 수 있따.
*  forward 받은 서블릿의 존재를 클라이언트가 알 필요가 없기 때문에 url자체는 변경되지 않는다. (사용자는 결과 화면만 제대로 받으면 되기 때문이다.)
*  forward 방식의 또 다른 특징은 요청 시 서버로 전송한 데이터가 남아있는 상태로 새로고침(=재요청)을 하면
*  동일한 요청을 반복하여 데이터베이스에 insert하는 등의 행위를 한다면 중복된 행이 삽입될 가능성이 있다.
*  따라서 forward 방식은 보통 데이터를 조회할 때 사용하는 방식이다.
* */
