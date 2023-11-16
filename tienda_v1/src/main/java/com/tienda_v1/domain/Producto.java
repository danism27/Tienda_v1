
package com.tienda_v1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto")

public class Producto implements Serializable{//serialización funciona para almacenar ciertos datos en el disco
    
    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria del idProducto
    
    @Id//tabla producto tiene una llave o identificador que es el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Los valores generados que tipo de estratagia utilizan, identico = sea igual en la BD y en la clase
    @Column(name="id_producto")//Decir cual es el nombre de la columna en la base de datos.
    private long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
    
    
    
}
