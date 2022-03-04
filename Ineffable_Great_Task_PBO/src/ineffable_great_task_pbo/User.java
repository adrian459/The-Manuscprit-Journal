/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ineffable_great_task_pbo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class User {
    private String name;
    private String gender;
    private String birthplace;
    private String birthdate;

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    private String address;
    private String phone;
    private String email;
    private String password;
    public User(String name, String gender, String birthplace, String birthdate, String address, String phone, String email, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");
            PreparedStatement pst = sqlConn.prepareStatement("insert into user(name, gender, birthplace, birthdate, address, phone, email, password)value(?,?,?,?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, gender);
            pst.setString(3, birthplace);
            pst.setString(4, birthdate);
            pst.setString(5, address);
            pst.setString(6, phone);
            pst.setString(7, email); 
            pst.setString(8, password); 
            pst.executeUpdate();
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }    
    }
    public User(){}
    public boolean searchUser(String email, String password){
        boolean isTrue = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");
            PreparedStatement pstEmail = sqlConn.prepareStatement("select id from user where email = ?");
            PreparedStatement pstPass = sqlConn.prepareStatement("select id from user where password = ?");
            pstEmail.setString(1, email); // Masih tanda tanya ? kenapa pstEmail.setString(1, email); harus 1
            pstPass.setString(1, password);// ini juga
            ResultSet e = pstEmail.executeQuery();
            ResultSet p = pstPass.executeQuery();
            if(p.next() == false && e.next() == false){
               isTrue = false;
            }else{
                isTrue = true;
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }finally{
            return isTrue;
        }
    }
    public void showProfile(String email, String password){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");
            PreparedStatement pstPass = sqlConn.prepareStatement("select name,gender,birthplace,birthdate,address,phone,email from user where password = ?");
            pstPass.setString(1, password);
            ResultSet p = pstPass.executeQuery();
            if(p.next()){
                setName(p.getString("name"));
                setGender(p.getString("gender"));
                setBirthplace(p.getString("birthplace"));
                setBirthdate(p.getString("birthdate"));
                setAddress(p.getString("address"));
                setPhone(p.getString("phone"));
                setEmail(p.getString("email"));
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
}
