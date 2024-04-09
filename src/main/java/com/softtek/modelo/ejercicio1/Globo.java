package com.softtek.modelo.ejercicio1;

import lombok.Data;

@Data
public class Globo {
    private static int contador = 1;
    private final int ID;

    public Globo() {
        this.ID = ++contador;
    }
}
