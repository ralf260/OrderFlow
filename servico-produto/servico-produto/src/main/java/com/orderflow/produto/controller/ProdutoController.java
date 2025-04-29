package com.orderflow.produto.controller;

import com.orderflow.produto.model.Produto;
import com.orderflow.produto.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController() {
        this.produtoService = null;
    }

    @GetMapping
    public List<Produto> listar() {
        return produtoService.listarTodos();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }
}