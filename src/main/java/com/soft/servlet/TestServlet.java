package com.soft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("访问test");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username==="+username+" , password===="+password);
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jx06";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, "root", "root");
            PreparedStatement pstm = null;
            ResultSet rs = null;
            String sql = "select * from user where username = ? and password = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("username"));
                response.getWriter().write("{\"username\": \"admin\",\"password\": \"admin\"}");
//                request.getRequestDispatcher("pages/filelist.jsp").forward(request,response);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
