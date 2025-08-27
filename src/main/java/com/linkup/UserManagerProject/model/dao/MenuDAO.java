//package com.linkup.UserManagerProject.model.dao;
//
//import com.ohgiraffers.section02.model.dto.MenuDTO;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.sql.*;
//import java.util.*;
//
//import static com.linkup.UserManagerProject.common.JDBCTemplate.close;
//import static com.ohgiraffers.common.JDBCTemplate.close;
//
//public class MenuDAO {
//
//    private Properties prop = new Properties();
//
//    public MenuDAO() {
//        try {
//            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public int selectLastMenuCode(Connection con) {
//
//        Statement stmt = null;
//        ResultSet rset = null;
//
//        int maxMenuCode = 0;
//
//        String query = prop.getProperty("selectLastMenuCode");
//
//        try {
//            stmt = con.createStatement();
//            rset = stmt.executeQuery(query);
//
//            if(rset.next()) {
//                maxMenuCode = rset.getInt("MAX(A.MENU_CODE)");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            close(rset);
//            close(stmt);
//        }
//
//        return maxMenuCode;
//    }
//
//    public List<Map<Integer, String>> selectAllCategory(Connection con) {
//
//        Statement stmt = null;
//        ResultSet rset = null;
//
//        List<Map<Integer, String>> categoryList = null;
//
//        String query = prop.getProperty("selectAllCategoryList");
//
//        try {
//            stmt = con.createStatement();
//            rset = stmt.executeQuery(query);
//
//            categoryList = new ArrayList<>();
//
//            while (rset.next()) {
//                Map<Integer, String> category = new HashMap<>();
//                category.put(rset.getInt("CATEGORY_CODE"), rset.getString("CATEGORY_NAME"));
//
//                categoryList.add(category);
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            close(rset);
//            close(stmt);
//        }
//
//        return categoryList;
//    }
//
//}
