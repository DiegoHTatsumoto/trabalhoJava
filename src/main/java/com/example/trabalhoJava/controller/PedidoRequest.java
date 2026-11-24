package com.example.trabalhoJava.controller;

public record PedidoRequest(
        Long clienteId,
        Long produtoId,
        Integer quantidade
) {}
