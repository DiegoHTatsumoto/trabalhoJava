package com.example.trabalhoJava.repository;

import com.example.trabalhoJava.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository
        extends JpaRepository<Produto, Long> {
}
