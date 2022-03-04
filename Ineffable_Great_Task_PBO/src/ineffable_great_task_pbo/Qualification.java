/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ineffable_great_task_pbo;

import java.util.Date;

/**
 *
 * @author asus
 */
public class Qualification extends User{
    private double GPA;
    private String major;
    private int workExp;
    private String title;

    public Qualification(double GPA, String major, int workExp, String title, String name, String gender, String birthplace, String birthdate, String address, String phone, String email, String password) {
        super(name, gender, birthplace, birthdate, address, phone, email, password);
        this.GPA = GPA;
        this.major = major;
        this.workExp = workExp;
        this.title = title;
    }
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
