package com.synergy.backend.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cliente")
public class Cliente extends Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "cliente_id",nullable = false)
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clienteId;

    @Column(nullable = false,length = 10)
    private String password;

    @Column(nullable = false)
    private boolean estado;

    @OneToMany(mappedBy = "cliente")
    private List<Cuenta> cuentas;

    @OneToMany(mappedBy = "cliente")
    private List<Movimiento> movimientos;

    public Cliente(int idPersona,String nombre, Genero genero, int edad, String identificacion, String direccion,
                   String telefono, int clienteId, String password, boolean estado) {
        super(idPersona, nombre, genero, edad, identificacion, direccion,telefono);
        this.clienteId = clienteId;
        this.password = password;
        this.estado = estado;
    }
}
