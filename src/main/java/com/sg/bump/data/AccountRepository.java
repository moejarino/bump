/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bump.data;

import com.sg.bump.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author josephmarino
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>  {
    
}
