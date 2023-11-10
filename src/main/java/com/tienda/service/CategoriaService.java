/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface CategoriaService {

    //Se obtiene un array List con todas las categorias de la tabla
    public List<Categoria> getCategorias(boolean activo);

    //Se obtiene una Categoria según el id pasado por parámetro
    public Categoria getCategoria(Categoria categoria);

    //Se actualiza una categoria o se inserta una nueva... (Si no hay id es un insert)
    public void save(Categoria categoria);

    //Se elimina una categoria según el id pasado
    public void delete(Categoria categoria);

}
