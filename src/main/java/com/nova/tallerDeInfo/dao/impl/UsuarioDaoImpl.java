package com.nova.tallerDeInfo.dao.impl;


import com.nova.tallerDeInfo.dao.UsuarioDao;
import com.nova.tallerDeInfo.tool.Consulta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nemo_
 */
@Service
public class UsuarioDaoImpl  extends Consulta implements UsuarioDao  {

    @Override
    public void addUsuario(String nombre, String email) {
       
        try(Connection connection = getMySqlConnection()){
            
            Statement st = connection.createStatement();
            
            String query =" INSERT INTO USUARIO (NOMBRE,CORREO) VALUES ('"+nombre+"','"+email+"')";
            
            st.executeUpdate(query);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List getAllUsers() {
        
        List<HashMap<String,Object>> usuarios= new ArrayList<>();
        
        try(Connection connection = getMySqlConnection()){
            
            Statement st = connection.createStatement();
            
            String query = "SELECT * from USUARIO ";
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                HashMap userTmp = new HashMap();
                
                userTmp.put("id", rs.getInt("ID"));
                userTmp.put("nombre", rs.getString("NOMBRE"));
                 userTmp.put("correo", rs.getString("CORREO"));
                 usuarios.add(userTmp);
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return usuarios;
    }
    
}
