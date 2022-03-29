package project.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.hibernate.SessionFactory;

public class loginDAO {

    String sql = "SELECT * FROM Customer WHERE name = ? AND password=?";
    String url = "jdbc:mysql://localhost:3306/realestate";
    String username = "root";
    String password = "";

    public boolean check(String uname, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, uname);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
        public int getCustomerID(String uname, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, uname);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt("custId");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}