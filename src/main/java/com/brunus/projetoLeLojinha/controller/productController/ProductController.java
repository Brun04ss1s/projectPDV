package com.brunus.projetoLeLojinha.controller.productController;

import com.brunus.projetoLeLojinha.domain.model.product.Product;
import com.brunus.projetoLeLojinha.domain.model.product.ProductRequestDTO;
import com.brunus.projetoLeLojinha.service.productService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductRequestDTO data){
        Product product = service.createProduct(data);
        return ResponseEntity.ok(product);
    }

    @GetMapping
    public List<Product> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable UUID id){
        return service.getdById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public  ResponseEntity<Product> actualizeProduct(@PathVariable UUID id, @RequestBody ProductRequestDTO actualizedProduct){
        return service.updateProduct(id, actualizedProduct)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public boolean deleteProduct(@PathVariable UUID id){
        return service.deleteProduct(id);
    }
}
