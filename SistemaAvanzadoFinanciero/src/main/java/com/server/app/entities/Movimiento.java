package com.server.app.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "Movimiento_data")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String moneda_Original;

    private Integer Tasa_Cambio;

    private Integer monto;

    private Date fecha;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "cuenta_id", nullable = false, foreignKey = @ForeignKey(name ="fk_cuenta_id"))
    private Cuenta cuenta;

    @ManyToOne
    @JoinColumn(name="categoria_id", nullable = false, foreignKey = @ForeignKey(name = "fk_categoria_id"))
    private Categoria categoria;


}
