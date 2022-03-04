/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myart;

import java.util.ArrayList;

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
    public Criteria(String companyName,String jobDesk, double minGPA, int minWorkExp, String major, String title, double salary, String info, String releaseDate) {
        super(jobDesk, salary, info, releaseDate);
        this.releaseDate = releaseDate;
        this.info = info;
        this.jobDesk = jobDesk;
        this.minGPA = minGPA;
        this.minWorkExp = minWorkExp;
        this.major = major;
        this.title = title;
        this.salary = salary;
        this.companyName = companyName;
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
    public boolean isAccepted(String Major, String Title, int WorkExp, double GPA){
        boolean isAccept = false;
        if(Major.equals(getMajor()) && Title.equals(getTitle()) && WorkExp >= getMinWorkExp() && GPA >= getMinGPA()){
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

    @Override
    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }    
}
