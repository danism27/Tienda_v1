package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se declara un método para obtener un Arraylist de objeros categoria,
    //estos objetos vienen de la BD, todos los registros
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Se colocarán los métodos para hacer el Crud de categorías, pero en semana 6
}
