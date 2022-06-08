package com.company;
import java.sql.*;
//insert into database
public class JDBC_Practice2 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbcPractice";
        String userName = "anubhav";
        String Pass = "ANUbhav00@";
        Connection conn = null;
//        Statement st = null;
        PreparedStatement st = null;
        String query = "insert into jdbc_tbl values (?,?,?,?)";

        try {
            conn = DriverManager.getConnection(url, userName, Pass);
            st = conn.prepareStatement(query);
            st.setInt(1,7);
            st.setString(2,"T7");
            st.setString(3,"Abc");
            st.setString(4,"2021-8-05");
            int x = st.executeUpdate();
            System.out.println(x + " row/s affected");


//            int x = st.executeUpdate("insert into jdbc_tbl values(6,'T6','Xyz','2021-9-20')");
//            System.out.println(x + "rows affected");

        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
        finally {
            st.close();
            conn.close();
        }

    }
}
