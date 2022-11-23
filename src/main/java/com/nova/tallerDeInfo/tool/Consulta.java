/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nova.tallerDeInfo.tool;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nemo_
 */
public class Consulta {
   
    
    public Connection getMySqlConnection(){
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3310/tallerNova", "root", "3edCMysql");
            
        }catch(Exception e){
            e.printStackTrace();//
        }
      
        return connection;
    };
    
}
