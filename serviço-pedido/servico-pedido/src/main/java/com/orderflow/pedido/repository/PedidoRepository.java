// File: Pedido.java
package com.orderflow.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderflow.pedido.model.Pedido;


/**
 *
 * @author rafaellessa
 */

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
