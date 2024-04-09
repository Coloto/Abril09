package com.softtek.modelo;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Persona {
    private String nombre;
    private int edad;
    private int estadoCivil;

    @Override
    public String toString() {
        switch (estadoCivil){
            case 0:
                return nombre+": "+ edad +" años. Está soltero";
            case 1:
                return nombre+": "+ edad +" años. Está casado";
            case -1:
                return nombre+": "+ edad +" años. Está divorciado";
            case -2:
                return nombre+": "+ edad +" años. Está viudo";
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && estadoCivil == persona.estadoCivil && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, estadoCivil);
    }
}
