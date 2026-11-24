package com.example.trabalhoJava.repository;

import com.example.trabalhoJava.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository
        extends JpaRepository<Pedido, Long> {
}
