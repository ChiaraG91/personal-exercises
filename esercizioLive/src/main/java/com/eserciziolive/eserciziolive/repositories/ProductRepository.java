package com.eserciziolive.eserciziolive.repositories;

import com.eserciziolive.eserciziolive.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByNome(String nome);
}
