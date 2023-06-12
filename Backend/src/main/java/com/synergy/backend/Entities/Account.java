package com.synergy.backend.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Account implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "account_number", length = 12)
    private String accountNumber;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Column(nullable = false)
    private double balance;

    @Column(nullable = false)
    private Status status;

    @ToString.Exclude
    @ManyToOne
    private Customer customer;

    @ToString.Exclude
    @OneToMany(mappedBy = "account")
    private List<Movement> movements;
}
