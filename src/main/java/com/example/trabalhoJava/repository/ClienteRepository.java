package com.example.trabalhoJava.repository;

import com.example.trabalhoJava.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository
        extends JpaRepository<Cliente, Long> {
}
