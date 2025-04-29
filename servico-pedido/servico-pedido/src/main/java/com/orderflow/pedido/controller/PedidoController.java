// File: Pedido.java
package com.orderflow.pedido.controller;
import com.orderflow.pedido.model.Pedido;
import com.orderflow.pedido.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    // Endpoint para buscar todos os pedidos
    @GetMapping
    public List<Pedido> getPedidos() {
        return pedidoService.getAllPedidos();
    }

    // Endpoint para criar um novo pedido
    @PostMapping
    public Pedido createPedido(@RequestBody Pedido pedido) {
        return pedidoService.createPedido(pedido);
    }

    // Endpoint para buscar um pedido por ID
    @GetMapping("/{id}")
    public Pedido getPedidoById(@PathVariable Long id) {
        return pedidoService.getPedidoById(id);
    }
}
