package com.eserciziolive.eserciziolive.controllers;

import com.eserciziolive.eserciziolive.entities.ProductEntity;
import com.eserciziolive.eserciziolive.repositories.ProductRepository;
import com.eserciziolive.eserciziolive.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addproduct")
    public ResponseEntity<ProductEntity> createProduct(@RequestBody ProductEntity productEntity){
        productService.addProduct(productEntity);
        return ResponseEntity.ok().body(productEntity);
    }

    @GetMapping("/productbyid/{id}")
    public ResponseEntity<ProductEntity> findProductById(@PathVariable Long id){
        Optional<ProductEntity> productEntityOptional = productService.getProduct(id);
        if(productEntityOptional.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(productEntityOptional.get());
    }

    @GetMapping("/products")
    public ResponseEntity<ProductEntity> findProducts(){
        List<ProductEntity> productEntityOptional = productService.getAllProduct();
        return ResponseEntity.ok().body((ProductEntity) productEntityOptional);
    }


    @PutMapping("/modificaprodotto")
    public ResponseEntity<ProductEntity> updateProductById(@RequestBody ProductEntity productEntity, @RequestParam Long id){
        Optional<ProductEntity> productEntityOptional = productService.updateProduct(id,productEntity);
        if(productEntityOptional.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(productEntity);
    }

    @DeleteMapping("/deleteprodotto")
    public ResponseEntity<ProductEntity> deleteProduct(@RequestBody ProductEntity productEntity){
        productService.deleteSingleProduct(productEntity);
        return ResponseEntity.ok().body(productEntity);
    }
}
