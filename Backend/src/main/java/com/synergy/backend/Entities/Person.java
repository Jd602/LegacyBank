package com.synergy.backend.Entities;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public class Person implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @ToString.Exclude
    private Gender gender;

    @ToString.Exclude
    private LocalDate birthday;
}
