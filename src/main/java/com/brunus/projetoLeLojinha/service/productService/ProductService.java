package com.brunus.projetoLeLojinha.service.productService;

import com.brunus.projetoLeLojinha.domain.model.person.Person;
import com.brunus.projetoLeLojinha.domain.model.product.Product;
import com.brunus.projetoLeLojinha.domain.model.product.ProductRequestDTO;
import com.brunus.projetoLeLojinha.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public class ProductService {

    private final ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public Product createProduct(ProductRequestDTO data){

        //Pegando a pessoa que está criando o produto
        Person person = new Person();
        person.setId(data.personId().intValue());

        //Pegando o momento atual
        LocalDateTime date = LocalDateTime.now();

        //Criando o produto
        Product product = new Product();
        product.setPerson(person);
        product.setName(data.name());
        product.setPrice(data.price().intValue());
        product.setLastUpdate(date);

        return repository.save(product);
    }

    public Optional<Product> getdById(UUID id){
        return repository.findById(id);
    }

    public List<Product> getAll(){
        return repository.findAll();
    }

    public Optional<Product> updateProduct(UUID id, ProductRequestDTO actualizedProduct){
        return repository.findById(id).map(product ->  {

            LocalDateTime date = LocalDateTime.now();

            product.setPrice(actualizedProduct.price());
            product.setLastUpdate(date);

            return repository.save(product);
        });
    }

    public boolean deleteProduct(UUID id){

        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }

        return false;
    }
}
