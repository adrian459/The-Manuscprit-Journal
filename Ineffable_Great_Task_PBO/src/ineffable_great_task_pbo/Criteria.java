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
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class Criteria extends JobVacancy{
    protected Qualification qualification;
    private double minGPA;
    private int minWorkExp;
    private String major;
    private String title;
    private double Salary;
    private String companyName;
    public void updateDatabase(DefaultTableModel RecordTable) throws SQLException{
        Connection sqlConn = null;
        PreparedStatement pst =  null;
        ResultSet rs = null;
        int q, i, id, deleteItem;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");
            pst = sqlConn.prepareStatement("select * from criteria");
            rs = pst.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();
            
            
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                for(i = 1; i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("jobdesk"));
                    columnData.add(rs.getString("gpa"));
                    columnData.add(rs.getString("workexp"));
                    columnData.add(rs.getString("major"));
                    columnData.add(rs.getString("title"));
                    columnData.add(rs.getString("salary"));
                    columnData.add(rs.getString("info"));
                }
                RecordTable.addRow(columnData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void updateDatabaseCriteria(DefaultTableModel RecordTable) throws SQLException{
        Connection sqlConn = null;
        PreparedStatement pst =  null;
        ResultSet rs = null;
        int q, i, id, deleteItem;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");
            pst = sqlConn.prepareStatement("select * from criteria");
            rs = pst.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();            
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                for(i = 1; i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("jobdesk"));
                    columnData.add(rs.getString("salary"));
                    columnData.add(rs.getString("info"));
                }
                RecordTable.addRow(columnData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public Criteria(String companyName,String jobDesk, double minGPA, int minWorkExp, String major, String title, double salary, String info) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");
            PreparedStatement pst = sqlConn.prepareStatement("insert into criteria(name, jobdesk, gpa, workexp, major, title, salary, info)value(?,?,?,?,?,?,?,?)");
            pst.setString(1, companyName);
            pst.setString(2, jobDesk);
            pst.setDouble(3, minGPA);
            pst.setInt(4, minWorkExp);
            pst.setString(5, major);
            pst.setString(6, title);
            pst.setDouble(7, salary); 
            pst.setString(8, info); 
            pst.executeUpdate();
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }            
    }
    public Criteria(){
        
    }
    public void applyJob(int id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/jobvacancy_app_db","root","");
            PreparedStatement pstID = sqlConn.prepareStatement("select id, gpa, workexp, major from criteria where id=?");
            pstID.setInt(1, id);
            ResultSet i = pstID.executeQuery();
            ParseStartToQ parse = new ParseStartToQ();
            if(i.next() == false){
                System.out.println("Ada yang error nih");
            }else{
                ParseStartToQ.gpa = Double.parseDouble(i.getString("gpa"));
                ParseStartToQ.workExp = Integer.parseInt(i.getString("workexp"));
                ParseStartToQ.major = i.getString(major);
                System.out.println(ParseStartToQ.major);
                System.out.println(ParseStartToQ.gpa);
                System.out.println(ParseStartToQ.workExp);
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
//        parse.gpa = Double.parseDouble(result.getString("gpa"));
//                parse.workExp = Integer.parseInt(result.getString("workexp"));
//                parse.major = result.getString(major);
    }
    /*public Criteria(String companyName,String jobDesk, double minGPA, int minWorkExp, String major, String title, double salary, String info, String releaseDate) {
        int i = 0;
        while(!companyName.equals(company.get(i).getNamaPerusahaan()) && i < company.size()){
            i++;
        }
        if(companyName.equals(company.get(i).getNamaPerusahaan())){
            this.companyName = company.get(i).getNamaPerusahaan();
        }else{
            this.companyName = "Company Not Found";
        }
        this.releaseDate = releaseDate;
        this.info = info;
        this.jobDesk = jobDesk;
        this.minGPA = minGPA;
        this.minWorkExp = minWorkExp;
        this.major = major;
        this.title = title;
        this.salary = salary;
    }*/
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }        
    public boolean isAccepted(String Major, int WorkExp, double GPA, String m, int work, double g){
        boolean isAccept = false;
        if(Major.equals(m) && WorkExp >= work && GPA >= g){
            isAccept = true;
        }else{
            isAccept = false;
        }
        return isAccept;
    } 
    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public double getMinGPA() {
        return minGPA;
    }

    public void setMinGPA(double minGPA) {
        this.minGPA = minGPA;
    }

    public int getMinWorkExp() {
        return minWorkExp;
    }

    public void setMinWorkExp(int minWorkExp) {
        this.minWorkExp = minWorkExp;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String getJobDesk() {
        return jobDesk;
    }

    @Override
    public void setJobDesk(String jobDesk) {
        this.jobDesk = jobDesk;
    }
    //Experiment
    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = Salary;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }
}
