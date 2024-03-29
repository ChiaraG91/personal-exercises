package com.esercizioLive0103.esercizioLive0103.services;

import com.esercizioLive0103.esercizioLive0103.entities.Product;
import com.esercizioLive0103.esercizioLive0103.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product createProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    public List<Product> getAllProduct() {
        List<Product> products = (List<Product>) productRepository.findAll();
        return products;
    }

    public Optional<Product> getProductbyId(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional;
    }

    public Product getProductByNome(String nome){
        Product product = productRepository.findByNome(nome);
        return product;
    }

    public Optional<Product> updateProduct(Long id,Product product){
        Optional<Product> prodottoDaAggiornare = productRepository.findById(id);
        if (prodottoDaAggiornare.isPresent()){
            prodottoDaAggiornare.get().setNome(product.getNome());
            productRepository.save(prodottoDaAggiornare.get());
        } else {
            return Optional.empty();
        }
        return prodottoDaAggiornare;
    }


    public Product deleteProduct(Long id, Product product){
        productRepository.deleteById(id);
        return product;
    }

}
