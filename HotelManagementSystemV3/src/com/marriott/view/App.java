/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marriott.view;
import com.marriott.dao.ClientDao;
import com.marriott.model.Client;
import java.util.*;

/**
 *
 * @author LEGACY TECHNOLOGY
 */
public class App {
    public static void main(String[] args){
    boolean condition=true;
    String name;
    String nationalId;
    String phoneNumber;
    String email;
    int age;
    
    while(condition){
        System.out.println("Hotel Management System");
        System.out.println("===========================");
        System.out.println("1.Register Client ");
        System.out.println("2.Update Client");
        System.out.println("3.Delete Client");
        System.out.println("4.Display all Client");
        System.out.println("5. Find Client By id");
        System.out.println("0.Exit");
        System.out.println("-----------------------");
        System.out.print("Chose: ");
        Scanner input= new Scanner(System.in);
        
        int choice = input.nextInt();
    
        switch(choice){
            case 1:
                System.out.println("Register Client");
                System.out.println("----------------------");
                System.out.print("Enter client Id: ");
                nationalId = input.next();
                System.out.print("Enter client name: ");
                name= input.next();
                System.out.print("Enter client phone number: ");
                phoneNumber = input.next();
                System.out.print("Enter client Email: ");
                email= input.next();
                System.out.print("Enter client Age: ");
                age=input.nextInt();

                //seding data to model
                Client clientObj = new Client();
                clientObj.setNationalId(nationalId);
                clientObj.setName(name);
                clientObj.setPhoneNumber(phoneNumber);
                clientObj.setEmail(email);
                clientObj.setAge(age);
                //sending data from model to DAO

                ClientDao dao= new ClientDao();
                
                int rowAffected = dao.registerClient(clientObj);
                
                if(rowAffected>0){
                    System.out.println("Data saved sucessfull");
                }else{
                    System.out.println("Data not saved");
                    
                }
                
                
                
                break;
            case 2:

                System.out.println("Option 2 selected");
                System.out.print("Enter Id to be update: ");
                nationalId=input.next();
                System.out.println("Enter new client´s name: ");
                name=input.next();
                System.out.println("Enter new client´s phone number:");
                phoneNumber=input.next();
                System.out.println("Enter new client´s email: ");
                email=input.next();
                System.out.println("Enter new client´s age: ");
                age=input.nextInt();


                //sending data to model
                Client UpdateClient= new Client();

                UpdateClient.setAge(age);
                UpdateClient.setEmail(email);
                UpdateClient.setNationalId(nationalId);
                UpdateClient.setPhoneNumber(phoneNumber);


                break;
            case 3:
                System.out.println("Option Delete selected");
                System.out.print("Enter client's Id: ");
                nationalId=input.next();

                Client deleteClient= new Client();

                deleteClient.setNationalId(nationalId);

                ClientDao delDao= new ClientDao();

                rowAffected=delDao.deleteClient(deleteClient);
                if(rowAffected>0){
                    System.out.println("CLient delected");
                }else{

                    System.out.println("CLient ID not FOUND");
                }
                break;
            case 4:
                    
                System.out.println("Option Display All selected");

                System.out.println("-----------------------------------------------------------------------");
                System.out.printf("%-5s %-15s %-15s %-25s %-5s\n",
                        "ID", "NAME", "PHONE", "EMAIL", "AGE");
                System.out.println("-----------------------------------------------------------------------");

                break;
            case 5:
                break;
            case 0:
                System.out.println("Thank u for using this System");
                System.exit(0);
        
        
        }
    
    }
    
    
    
    
    
    
    }
}
