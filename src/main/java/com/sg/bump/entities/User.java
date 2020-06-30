/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bump.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author josephmarino
 */
@Entity
@Data
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(unique = true)
    @NotBlank(message = "First name must not be empty.")
    private String username;
    
    @NotBlank(message = "First name must not be empty.")
    private String password;
    
    @NotBlank(message = "First name must not be empty.")
    private String firstName;
    
    @NotBlank(message = "First name must not be empty.")
    private String lastName;

    private boolean enabled;
    
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account accountId;
    
    @ManyToMany
    @JoinTable(name = "user_roles",
            joinColumns = {
                @JoinColumn(name = "user_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "role_id")})
            
    private List<Role> roles;
    
    
}
