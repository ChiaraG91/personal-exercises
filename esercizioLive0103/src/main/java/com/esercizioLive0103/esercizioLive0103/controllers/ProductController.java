package com.esercizioLive0103.esercizioLive0103.controllers;

import com.esercizioLive0103.esercizioLive0103.entities.Product;
import com.esercizioLive0103.esercizioLive0103.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        productService.createProduct(product);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping("/getlist")
    public ResponseEntity<List<Product>> getAllProduct(){
        List<Product> allProducts = productService.getAllProduct();
        return ResponseEntity.ok().body(allProducts);
    }

    @GetMapping("/getproduct/{id}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable Long id){
        Optional<Product> productOptional = productService.getProductbyId(id);
        return ResponseEntity.ok().body(productOptional);
    }

    @GetMapping("/getproduct")
    public ResponseEntity<Product> getProductByName(@RequestParam String nome){
        Product product = productService.getProductByNome(nome);
        return ResponseEntity.ok().body(product);
    }

    @PutMapping("/updateproduct/{id}")
    public ResponseEntity<Product> updateProductById(@RequestBody Product product,@PathVariable Long id){
        Optional<Product> productOptional = productService.updateProduct(id,product);
        if(productOptional.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id, @RequestBody Product product){
        Product prodottoDaCancellare = productService.deleteProduct(id,product);
        return ResponseEntity.ok().body(prodottoDaCancellare);
    }

}
