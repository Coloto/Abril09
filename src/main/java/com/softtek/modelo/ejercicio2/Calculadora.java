package com.softtek.modelo.ejercicio2;

import lombok.Data;

@Data
public class Calculadora {

    public final double sumar(int x, int y){
        return x+y;
    }
    public final double restar(int x, int y){
        return x-y;
    }
    public final double multiplicar(int x, int y){
        return x*y;
    }
    public final double dividir(int x, int y){
        return x/y;
    }

}
