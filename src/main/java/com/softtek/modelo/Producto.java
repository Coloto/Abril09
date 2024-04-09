package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Producto {
    public static int contador=1;
    private final int ID;
    private String nombre;
    private double precio;

    public Producto() {
        this.ID = ++contador;
    }

    private final double importe(int cantidad){
        return cantidad*precio;
    }
}
