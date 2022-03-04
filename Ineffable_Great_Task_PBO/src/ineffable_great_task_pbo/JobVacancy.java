/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ineffable_great_task_pbo;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public abstract class JobVacancy {
    protected String jobDesk;
    protected double salary;
    protected String info;
    
    protected ArrayList<Company> company = new ArrayList<>();
    public JobVacancy(String jobDesk, double salary, String info, String releaseDate) {
        this.jobDesk = jobDesk;
        this.salary = salary;
        this.info = info;
        
    }
    public ArrayList<Company> getCompany() {
        return company;
    }
    public void setCompany(ArrayList<Company> company) {
        this.company = company;
    }
    public JobVacancy(){}
    public abstract String getJobDesk();
    public abstract void setJobDesk(String jobDesk);
    public abstract double getSalary();
    public abstract void setSalary(double salary);
    public abstract String getInfo();
    public abstract void setInfo(String info);
     
}
