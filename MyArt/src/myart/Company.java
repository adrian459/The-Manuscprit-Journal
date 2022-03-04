/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myart;

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
    public Company(String namaPerusahaan, String address, String city, String postalCode, String phone, String email, String info, String field) {
        this.namaPerusahaan = namaPerusahaan;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
        this.info = info;
        this.field = field;
    }

    Company() {
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
    public void display(){
        System.out.println("Company name :"+ getNamaPerusahaan());
        System.out.println("Address      :"+ getAddress());
        System.out.println("City         :"+ getCity());
        System.out.println("Postal Code  :"+ getPostalCode());
        System.out.println("Phone        :"+ getPhone());
        System.out.println("Email        :"+ getEmail());
        System.out.println("Info         :"+ getInfo());
        //System.out.println("Field        :"+ field());
    }
}