package com.brunus.projetoLeLojinha.controller.productController;

import com.brunus.projetoLeLojinha.domain.model.product.Product;
import com.brunus.projetoLeLojinha.domain.model.product.ProductRequestDTO;
import com.brunus.projetoLeLojinha.service.productService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
