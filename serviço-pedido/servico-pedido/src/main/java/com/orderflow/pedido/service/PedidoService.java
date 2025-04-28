// File: Pedido.java
package com.orderflow.pedido.service;
import com.orderflow.pedido.model.Pedido;
import com.orderflow.pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;  // Importação da anotação do Lombok
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService() {
        this.pedidoRepository = null;
    }

    // Método para buscar todos os pedidos
    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    // Método para criar um novo pedido
    public Pedido createPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Método para buscar um pedido por ID
    public Pedido getPedidoById(Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.orElse(null);  // Retorna o pedido ou null se não encontrado
    }
}