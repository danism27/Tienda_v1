
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;


public interface ReporteService {
    
    public ResponseEntity<Resource> generarReporte(
            String reporte,//El nombre del archivo llamado .jasper (usuarios.jasper o ventas.jasper)
            Map<String, Object> parametros,// Se pasan los parámetros selccionados para la creación del archivo jasper
            String tipo) throws IOException;//El tipo de reporte que el usuario va a ver o descargar (csv, pdf, xlsx, txt)
    
}
