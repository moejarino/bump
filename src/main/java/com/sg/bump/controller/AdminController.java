/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bump.controller;

import com.sg.bump.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author josephmarino
 */
@Controller
public class AdminController {

    @Autowired
    UserRepository users;

    @GetMapping("/admin")
    public String displayAdminPage(Model model) {
        model.addAttribute("users", users.findAll());
        return "admin";
    }
}
