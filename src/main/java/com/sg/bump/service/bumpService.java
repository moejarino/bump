/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bump.service;

import com.sg.bump.data.AccountRepository;
import com.sg.bump.data.BorrowRequestRepository;
import com.sg.bump.data.LendProposalRepository;
import com.sg.bump.data.RoleRepository;
import com.sg.bump.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author josephmarino
 */
public class bumpService {
    
    @Autowired
    AccountRepository accountRepo;

    @Autowired
    BorrowRequestRepository borrowRepo;

    @Autowired
    LendProposalRepository lendRepo;

    @Autowired
    RoleRepository roleRepo;

    @Autowired
    UserRepository securityRepo;
    
}
