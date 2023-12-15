package com.tienda.dao;

import com.tienda.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Daniel
 */
public interface FacturaDao extends JpaRepository<Factura, Long> {

}
