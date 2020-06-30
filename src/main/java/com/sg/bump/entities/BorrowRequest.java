/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bump.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author josephmarino
 */
@Entity
@Data
public class BorrowRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int borrowId;

    @NotBlank(message = "First name must not be empty.")
    private BigDecimal interest;

    @NotBlank(message = "First name must not be empty.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate start_date;

    @NotBlank(message = "First name must not be empty.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate payback_date;

    @NotBlank(message = "First name must not be empty.")
    private BigDecimal annual_interest_rate;

    @Min(0)
    @Max(10000)
    @NotBlank(message = "First name must not be empty.")
    private BigDecimal principal;

    @ManyToOne
    @JoinColumn(name = "compound_interval_id")
    private CompoundInterval compoundInterval;

    private boolean accepted;
    private boolean completed;

}
