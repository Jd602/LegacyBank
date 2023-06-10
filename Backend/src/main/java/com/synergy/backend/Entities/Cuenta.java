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
@Table(name="cuenta")
public class Cuenta implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 12)
    @ToString.Include
    private String numeroCuenta;

    @Column(nullable = false)
    private TipoCuenta tipoCuenta;


    @Column(nullable = false)
    private double saldoInicial;

    @NonNull
    @ToString.Include
    private boolean estado;

    @ManyToOne
    //@JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "cuenta")
    private List<Movimiento> movimientos;
}
