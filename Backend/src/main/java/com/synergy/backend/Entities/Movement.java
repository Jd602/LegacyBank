package com.synergy.backend.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Movement implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDate date;

    private String type;

    @Column(nullable = false)
    private double amount;

    @ManyToOne
    private Account account;

    @ToString.Exclude
    @ManyToOne
    private Customer customer;
}
