package com.softtek.presentacion;

import com.softtek.modelo.ConfiguracionAplicacion;
import com.softtek.modelo.Producto;
import com.softtek.modelo.ejercicio3.Persona;
import com.softtek.modelo.ejercicio2.Calculadora;
import com.softtek.modelo.ejercicio1.Globo;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /*Producto producto1 = new Producto();
        System.out.println(producto1.toString());
        Producto producto2 = new Producto();
        System.out.println(producto2.toString());*/

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();

        //numerosPositivos();
        //cadenaVacia();
        //par();
        //mayor();
        //primo();

        //mayus();
        //numeros();
        //detalles();
        //dialogo();
        //archivoRegistro();

        //numAleatorio();
        //lista();
        //fechaHora();
        //textoVacio();
        configuracion();
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

        Persona p1 = new Persona("Juan", 20, SOLTERO);
        Persona p2 = new Persona("Paco", 53, CASADO);
        Persona p3 = new Persona("Esteban", 38, DIVORCIADO);
        Persona p4 = new Persona("Mario", 68, VIUDO);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }

    public static void numerosPositivos(){ //predicado 1
        Predicate<Integer> positivo = x-> x>0;
        System.out.println(positivo.test(4));
        System.out.println(positivo.test(-4));
    }

    public static void cadenaVacia(){ //predicado 2
        Predicate<String> cadena = x -> !x.isEmpty();
        System.out.println(cadena.test("Hola"));
        System.out.println(cadena.test(""));
    }

    public static void par(){ //predicado 3
        Predicate<Integer> par = x -> x%2==0;
        System.out.println(par.test(2));
        System.out.println(par.test(3));
    }

    public static void mayor(){ //predicado 4
        Predicate<Integer> mayor = x -> x>15;
        System.out.println(mayor.test(5));
        System.out.println(mayor.test(34));
    }

    public static void primo(){ //predicado 5
        Predicate<Integer> primo = numero -> {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(primo.test(7));
        System.out.println(primo.test(4));
    }

    public static void mayus(){ //consumer 1
        Consumer<String> mayus = texto -> System.out.println(texto.toUpperCase());
        mayus.accept("Hola que tal");
    }

    public static void numeros(){ //consumer 2
        Consumer<Integer> numeros = numero -> System.out.println(numero + " - " + numero*2);
        numeros.accept(2);
    }

    public static void detalles(){ //consumer 3
        Producto p1 = new Producto("Manzana", 34);
        Consumer<Producto> detalles = producto -> System.out.println("Nombre: " + producto.getNombre() + "\nPrecio: " + producto.getPrecio());
        detalles.accept(p1);
    }

    public static void dialogo(){ //consumer 4
        Consumer<String> dialogo = texto -> JOptionPane.showMessageDialog(null, texto);
        dialogo.accept("Hola que tal");
    }

    public static void archivoRegistro(){ //consumer 5
        Consumer<String> escribirRegistro = texto -> {
            try {
                FileWriter file = new FileWriter("registro.txt", true);
                PrintWriter buffer = new PrintWriter(file);
                buffer.println(texto);
                buffer.close();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        escribirRegistro.accept("Error: No se pudo conectar a la base de datos.");
    }

    public static void numAleatorio(){ //supplier 1
        Supplier<Integer> numAleatorio = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };
        System.out.println(numAleatorio.get());
    }

    public static void lista(){ //supplier 2
        Supplier<ArrayList> listaDeElementos = () -> {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("Paco");
            lista.add("Pepe");
            lista.add("Juan");
            return lista;
        };
        System.out.println(listaDeElementos.get());
    }

    public static void fechaHora(){ //supplier 3
        Supplier<LocalDateTime> fechaYHora = () -> {
            return LocalDateTime.now();
        };
        System.out.println(fechaYHora.get());
    }

    public static void textoVacio(){ //supplier 4
        Supplier<String> textoVacio = () -> {
            return "";
        };
        System.out.println(textoVacio.get());
    }

    public static void configuracion(){ //supplier 5
        Supplier<Object> configuracion = () -> {
            String rutaDelArchivo = "/ruta/del/archivo";
            String ajustesDeConexion = "configuración_de_conexión";
            return new ConfiguracionAplicacion(rutaDelArchivo, ajustesDeConexion);
        };
        System.out.println(configuracion.get());
    }
}
