package com.server.app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Cuenta_data")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String usuario_id;

    @Enumerated(EnumType.STRING)
    private TipoMoneda moneda;

    private Integer saldo_base;

    @Enumerated(EnumType.STRING)
    private TipoCuenta tipo;

}
