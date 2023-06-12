package com.synergy.backend.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Customer extends Person implements Serializable {

    @Column(nullable = false,length = 10)
    private String password;

    @Column(nullable = false,length = 120)
    @ToString.Include
    private String address;

    @ManyToOne
    private City city;

    @Column(name = "phone_numbers",nullable = false)
    @ToString.Include
    @ElementCollection
    private Map<String, String> phoneNumbers;

    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;

    @OneToMany(mappedBy = "customer")
    private List<Movement> movements;


}
