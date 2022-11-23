/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nova.tallerDeInfo.service;

import java.util.List;

/**
 *
 * @author nemo_
 */
public interface UsuarioService {

    public void addUsuario(String nombre, String email);

    public List getAllUsers();
    
}
