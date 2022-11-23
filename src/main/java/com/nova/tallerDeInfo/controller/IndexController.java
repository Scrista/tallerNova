/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nova.tallerDeInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nemo_
 */
@Controller
public class IndexController {
    
    @RequestMapping({"/","/index"})
    public String ususaios(){
        return "vistaUsuario";
    }
}
