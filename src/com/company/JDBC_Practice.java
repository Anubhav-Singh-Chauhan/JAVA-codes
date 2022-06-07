package com.company;

import java.sql.*;
//Fetch Data From table.
public class JDBC_Practice {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcPractice";
        String userName = "anubhav";
        String Pass ="ANUbhav00@";


        Connection conn = DriverManager.getConnection(url,userName,Pass);
        Statement st = conn.createStatement();
//        ResultSet result = st.executeQuery("select author from jdbc_tbl where jdbc_id=3");
//        result.next();
//        String name = result.getString("author");
//        System.out.println(name);
        ResultSet result = st.executeQuery("select * from jdbc_tbl");
//        result.next();
//        String rs = result.getInt(1) + ":" + result.getString(3);
//        System.out.println(rs);
      String userData;
        while (result.next())
        {
            userData = result.getInt(1) + " : " + result.getString(2) + " : " + result.getString(3) + " : " + result.getString(4);
            System.out.println(userData);
        }
        result.close();
        st.close();
        conn.close();



    }
}
