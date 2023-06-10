package com.synergy.backend.Entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Movimiento implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movimientoId;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private String tipoMovimiento;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private double saldo;

    @ManyToOne
    //@JoinColumn(nullable = false)
    private Cuenta cuenta;

    @ManyToOne
    //@JoinColumn(nullable = false)
    private Cliente cliente;
}
