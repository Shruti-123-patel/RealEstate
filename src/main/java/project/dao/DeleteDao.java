package project.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;

public class DeleteDao {

    String sql;
    String sql_2 = "INSERT INTO `orders`(`custId`, `productTypeId`, `productId`) VALUES (?,?,?)";
    String url = "jdbc:mysql://localhost:3306/realestate";
    String username = "root";
    String password = "";

    public boolean check(String ProductID, String ProductKeyId,HttpServletRequest req) {
        try {
        	
            if (ProductKeyId.equals("2")) {
                sql = "DELETE FROM `residentialbuilding` WHERE `residentialbuilding`.`id` = ?";
            } else if (ProductKeyId.equals("1")) {
                sql = "DELETE FROM `hospital` WHERE `id` = ?";
            } else if (ProductKeyId.equals("3")) {
                sql = "DELETE FROM `complex` WHERE `id` = ?";
            } else if (ProductKeyId.equals("5")) {
                sql = "DELETE FROM `villa` WHERE `id` = ?";
            } else if (ProductKeyId.equals("4")) {
                sql = "DELETE FROM `office` WHERE `id` = ?";
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement st = con.prepareStatement(sql);
            PreparedStatement st2 = con.prepareStatement(sql_2);
            st.setInt(1, Integer.parseInt(ProductID));
            HttpSession session=req.getSession();
            int custID=(Integer) session.getAttribute("customerID");
            st2.setInt(1, custID);
            st2.setInt(2, Integer.parseInt(ProductKeyId));
            st2.setInt(3, Integer.parseInt(ProductID));
            int rowaffected = st.executeUpdate();
            int doneaffect = st2.executeUpdate();
//            if (rowaffected == 1) {
                return true;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}