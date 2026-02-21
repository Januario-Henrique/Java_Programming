/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marriott.model;

/**
 *
 * @author Janaurio Henrique
 */
public class Client {
   //private variable
    private String name;
    private String nationalId;
    private String phoneNumber;
    private int age;
    private String email;
    
    // cnstructor with no args
    
    public Client(){
    }
    //contructor with args
    public Client(String name,String nationalId,String phoneNumber,int age,String email){
        this.name=name;
        this.nationalId=nationalId;
        this.phoneNumber=phoneNumber;
        this.age=age;
        this.email=email;
    }
   public void setName(String name){ this.name=name;} 
   public void setNationalId(String nationalId){this.nationalId=nationalId;}
   
   public String getNationalId(){return nationalId;}
   public String getName(){return name;}//return this.name is the same

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
   
   
}
