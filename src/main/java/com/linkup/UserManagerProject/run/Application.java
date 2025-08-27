package com.linkup.UserManagerProject.run;

import com.linkup.UserManagerProject.model.dto.UserDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.linkup.UserManagerProject.common.JDBCTemplate.close;
import static com.linkup.UserManagerProject.common.JDBCTemplate.getConnection;

/*
Main Project : LinkupWebPage
Sub Project : UserManagerProject
Author : 2025-08-27 JeongHoon
내용 : JDBC TEST mysql 파일 과 연동하기
    ver 1.0  usertest1db 조회->성공 2025-08-27
    ver 1.1 DTO 통합 ->성공 2025-08-27
    ver 1.2 DAO 통합 ->>

* com.linkup.
├── common         // JDBCTemplate
├── config         // 설정 기능
├── controller     // 요청 처리
├── service        // 비즈니스 로직
├── model dto,dao     // DB 접근 로직 , 데이터 전송 객체
├── mapper         // MyBatis 등 매퍼 인터페이스
├── util
└── Application    // 메인

버전 :
 ver1 = usertest1db 조회하기
 ver1.1 = dto 통합



CREATE TABLE `USERTEST1`
(
    `USER_CD`    int NOT NULL ,
    `USER_ID`    VARCHAR(20) NOT NULL ,
    `USER_PW`    VARCHAR(20) NOT NULL ,
 PRIMARY KEY ( `USER_CD` )
)
* */
public class Application {

    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        List<UserDTO> userDTOList=new ArrayList<>();;

        try {
            pstmt=con.prepareStatement("SELECT USER_CD, USER_ID, USER_PW FROM USERTEST1");
            rset=pstmt.executeQuery();
            while(rset.next()){
                UserDTO userDTO=new UserDTO();
                userDTO.setUserCode(rset.getInt("USER_CD"));
                userDTO.setUserID(rset.getString("USER_ID"));
                userDTO.setUserPassword(rset.getString("USER_PW"));

                System.out.println(userDTO.getUserCode());
                System.out.println(userDTO.getUserID());
                System.out.println(userDTO.getUserPassword());
                userDTOList.add(userDTO);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(pstmt);
            close(rset);
        }


    }
}
