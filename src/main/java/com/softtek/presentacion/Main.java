package com.softtek.presentacion;

import com.softtek.modelo.ejercicio3.Persona;
import com.softtek.modelo.ejercicio2.Calculadora;
import com.softtek.modelo.ejercicio1.Globo;

public class Main {
    public static void main(String[] args) {
        /*Producto producto1 = new Producto();
        System.out.println(producto1.toString());
        Producto producto2 = new Producto();
        System.out.println(producto2.toString());*/

        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1(){
        Globo g1 = new Globo();
        System.out.println(g1.getID());
        Globo g2 = new Globo();
        System.out.println(g2.getID());
        Globo g3 = new Globo();
        System.out.println(g3.getID());
        Globo g4 = new Globo();
        System.out.println(g4.getID());
    }

    public static void ejercicio2(){
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(5,8));
        System.out.println(calc.restar(4,3434));
        System.out.println(calc.multiplicar(9,34));
        System.out.println(calc.dividir(233,7));
    }

    public static void ejercicio3(){
        final int SOLTERO = 0;
        final int CASADO = 1;
        final int DIVORCIADO = -1;
        final int VIUDO = -2;

        Persona p1 = new Persona("Juan", 20, 0);
        Persona p2 = new Persona("Paco", 53, 1);
        Persona p3 = new Persona("Esteban", 38, -1);
        Persona p4 = new Persona("Mario", 68, -2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
