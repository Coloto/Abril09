package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ConfiguracionAplicacion {
    private String rutaDelArchivo;
    private String ajustesDeConexion;
}
