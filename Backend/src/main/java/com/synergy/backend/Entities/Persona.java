package com.synergy.backend.Entities;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString(onlyExplicitlyIncluded = true)
public class Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    @ToString.Include
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    @EqualsAndHashCode.Include
    @Column(nullable = false)
    @ToString.Include
    private String nombre;

    @Column(nullable = false)
    @ToString.Include
    private Genero genero;

    @Column(nullable = false)
    @ToString.Include
    private int edad;

    @Column(nullable = false, length = 30, unique = true)
    @ToString.Include
    private String identificacion;

    @Column(nullable = false,length = 120)
    @ToString.Include
    private String direccion;

    @Column(nullable = false)
    @ToString.Include
    private String telefono;



}
