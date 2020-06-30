/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bump.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author josephmarino
 */
@Entity
@Data
public class CompoundInterval {
    
    @Id
    private int id;
    
    private String interval;
}
