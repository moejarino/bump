/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bump.entities;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author josephmarino
 */
@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotBlank
    private BigDecimal balance;
    
    @NotBlank
    private String bankAcct;

    @ManyToOne
    @JoinColumn(name = "borrow_request_id")
    private BorrowRequest borrowId;
    
    @ManyToOne
    @JoinColumn(name = "lend_proposal_id")
    private LendProposal lendId;

}
