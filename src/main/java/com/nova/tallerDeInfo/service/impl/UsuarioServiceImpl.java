/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nova.tallerDeInfo.service.impl;

import com.nova.tallerDeInfo.dao.UsuarioDao;
import com.nova.tallerDeInfo.service.UsuarioService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nemo_
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    UsuarioDao usuarioDao;
    
    private List<HashMap<String,Object>> user = new ArrayList<>();

    @Override
    public void addUsuario(String nombre, String email) {
       
        HashMap<String,Object> usuario = new HashMap<>();
        
        usuario.put("nombre", nombre);
        usuario.put("email", email);
        
        usuarioDao.addUsuario(nombre,email);
        
    }

    @Override
    public List getAllUsers() {
        
        return usuarioDao.getAllUsers();
    }
    
    
}
