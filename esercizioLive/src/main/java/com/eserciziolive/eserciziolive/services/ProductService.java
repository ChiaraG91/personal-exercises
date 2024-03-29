package com.eserciziolive.eserciziolive.services;

import com.eserciziolive.eserciziolive.entities.ProductEntity;
import com.eserciziolive.eserciziolive.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductEntity addProduct(ProductEntity productEntity) {
        ProductEntity savedProduct = productRepository.save(productEntity);
        return productEntity;
    }

    public Optional<ProductEntity> getProduct(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        return product;
    }

    public List<ProductEntity> getAllProduct() {
        List<ProductEntity> productEntityList = (List<ProductEntity>) productRepository.findAll();
        return productEntityList;
    }

    public Optional<ProductEntity> updateProduct(Long id,ProductEntity productEntity){
        Optional<ProductEntity> prodottoDaAggiornare = productRepository.findById(id);
        if (prodottoDaAggiornare.isPresent()){
            prodottoDaAggiornare.get().setNome(productEntity.getNome());
            prodottoDaAggiornare.get().setPrezzo(productEntity.getPrezzo());
            productRepository.save(prodottoDaAggiornare.get());
        } else {
            return Optional.empty();
        }
        return prodottoDaAggiornare;
    }

    public ProductEntity deleteSingleProduct(ProductEntity productEntity){
        productRepository.delete(productEntity);
        return productEntity;
    }

    public List<ProductEntity> getProduct(String nome) {
        List<ProductEntity> product = productRepository.findByNome(nome);
        return product;
    }


}
