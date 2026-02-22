/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marriott.dao;

import com.marriott.model.Client;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author LEGACY TECHNOLOGY
 */
public class ClientDao {
    // global variable 
    private String jdbcUrl="jdbc:mysql://localhost:3306/java_thursday_2026";
    private String dbUsername="root";
    private String dbPassword="";
    
    //CRUD Operation
    // CREATE --> INSERT
    public int registerClient(Client clientObj){
        // surround with try and catch
        try{
            //step 1: create connection
            Connection con= DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
            //step 2: Prepare statement
            String sql= "INSERT INTO client(id,name,phoneNumber,email,age) VALUES(?,?,?,?,?)";
            
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,clientObj.getNationalId());
            pst.setString(2,clientObj.getName());
            pst.setString(3,clientObj.getPhoneNumber());
            pst.setString(4,clientObj.getEmail());
            pst.setInt(5,clientObj.getAge());
         //strep 3 execute statement
         int rowsAffected= pst.executeUpdate();
        
        //strep 4 close connection
        con.close();
        return 1;
        }catch(Exception ex){
            System.out.println("Error: "+ ex.getMessage());
            ex.printStackTrace();
            return 0;
        }
        
        //update
        public int updateClient(Client clientObj){
            //update
            try{
                //step 1: connect with database
                Connection con= DriverManager.getConnection(jdbcUrl,dbUsername,dbPassword);
                //step2: Prepare statement
                String sql="UPDATE client SET name=?,phoneNumber=?,email=?,age=? WHERE  id=?";

                PreparedStatement pst= con.prepareStatement(sql);
                pst.setString(1,clientObj.getName());
                pst.setString(2, clientObj.getPhoneNumber());
                pst.setString(3, clientObj.getEmail());
                pst.setInt(4, clientObj.getAge());

                int rowAffected = pst.executeUpdate();


                con.close();
                return 1;
            }catch(Exception ex){
                System.out.println("Error:"+ex.getMessage());
                ex.printStackTrace();
                return 0;
            }
        }
        //delete
        public int deleteClient(Client clientObj){
            try{
                Connection con= DriverManager.getConnection(jdbcUrl,dbUsername,dbPassword);
                String sql="DELETE FROM client WHERE id=?";

                PreparedStatement pst= con.prepareStatement(sql);

                pst.setString(1,clientObj.getNationalId());


                con.close();
                return 1;
            }catch(Exception ex){
                System.out.println("Error: "+ ex.getMessage());
                ex.printStackTrace();
                return 0;
            }

        }
        //read
        public int readClient(){
            try{
                Connection con= DriverManager.getConnection(jdbcUrl,dbUsername,dbPassword);

                String sql="SELECT * FROM client";

                PreparedStatement pst= con.prepareStatement(sql);

                ResultSet rs= pst.executeQuery();

                boolean hasData= false;

                while(rs.next()){
                    hasData= true;

                    System.out.printf("%-5s %-15s %-15s %-25s %-5d",
                            rs.getString("id"),
                            rs.getString("name"),
                            rs.getString("phoneNumber"),
                            rs.getString("email"),
                            rs.getInt("age")
                    );



                }
                if(!hasData){
                    System.out.println("No Client Found ");

                }
                con.close();
                return 1;
            }catch(Exception ex){
                System.out.println("ERROR:"+ex.getMessage());
                ex.printStackTrace();
                return 0;

            }


        }
    }
}
