/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nova.tallerDeInfo.controller;

import com.nova.tallerDeInfo.service.UsuarioService;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author nemo_
 */

@Controller
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
   
    
    @RequestMapping("/addUsuario")
    
    public String addUsuario(@RequestParam(value="nombre") String nombre,
            @RequestParam(value="email") String email){
        
        usuarioService.addUsuario(nombre,email);
        
        return "vistaUsuario";
    }
    
    @RequestMapping("/listaUsuarios")
    @ResponseBody
    public String getAllUsers(){
        
        return JSONValue.toJSONString(usuarioService.getAllUsers());
    }
}
