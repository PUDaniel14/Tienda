package com.tienda.service.impl;

import com.tienda.dao.ProductoDao;
import com.tienda.domain.Producto;
import com.tienda.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Daniel
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activo) {
        var productos = productoDao.findAll();
        //Si son solo activas (activo = true) debo filtrar las inactivas
        if (activo) {
            productos.removeIf(e -> !e.isActivo());
        }
        return productos;

    }

    //Se obtiene una Producto según el id pasado por parámetro
    @Transactional(readOnly = true)
    @Override
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);

    }

    //Se actualiza una producto o se inserta una nueva... (Si no hay id es un insert)
    @Override
    public void save(Producto producto) {
        productoDao.save(producto);

    }

    
    //Se elimina una producto según el id pasado
    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);

    }

}
