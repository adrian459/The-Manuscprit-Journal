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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class Company implements BusinessField{
    private String namaPerusahaan;
    private String address;
    private String city;
    private String postalCode;
    private String phone;
    private String email;
    private String info;
    private String field;
    private int id;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Company(String namaPerusahaan, String address, String city, String postalCode, String phone, String email, String info, String field) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");
            PreparedStatement pst = sqlConn.prepareStatement("insert into company(name, address, city, postalcode, phone, email, info, field)value(?,?,?,?,?,?,?,?)");
            pst.setString(1, namaPerusahaan);
            pst.setString(2, address);
            pst.setString(3, city);
            pst.setString(4, postalCode);
            pst.setString(5, phone);
            pst.setString(6, email);
            pst.setString(7, info); 
            pst.setString(8, field); 
            pst.executeUpdate();
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }    
    }
    public void updateDatabase(DefaultTableModel RecordTable) throws SQLException{
        Connection sqlConn = null;
        PreparedStatement pst =  null;
        ResultSet rs = null;
        int q, i, id, deleteItem;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");
            pst = sqlConn.prepareStatement("select * from company");
            rs = pst.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();
            
            
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                for(i = 1; i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("address"));
                    columnData.add(rs.getString("city"));
                    columnData.add(rs.getString("postalcode"));
                    columnData.add(rs.getString("phone"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("info"));
                    columnData.add(rs.getString("field"));
                }
                RecordTable.addRow(columnData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public Company() {
    }
    public void listCompany(DefaultTableModel m){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//library 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");//connect mysql dengan database company
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery("select * from company");
            while(result.next()){
                m.insertRow(m.getRowCount(), new Object[]{result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7), result.getString(8), result.getString(9)});         
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void setField(String field){
        this.field = field;
    }
    @Override
    public String getField(){    
        return field;
    }
}
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");//library 
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");//connect mysql dengan database company
//            Statement st = con.createStatement();
//            ResultSet result = st.executeQuery("select * from company");
//            while(result.next()){
//                id = result.getInt(1); //mengambil integer kolom ke -1
//                name = result.getString(2);
//                address = result.getString(3);
//                city = result.getString(4);
//                postalcode = result.getString(5);
//                phone = result.getString(6);
//                email = result.getString(7);
//                info = result.getString(8);
//                field = result.getString(9);
//            
//            }
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.println(e.getMessage());
//        }