package com.esercizioLive0103.esercizioLive0103.repositories;

import com.esercizioLive0103.esercizioLive0103.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByNome(String nome);
}
