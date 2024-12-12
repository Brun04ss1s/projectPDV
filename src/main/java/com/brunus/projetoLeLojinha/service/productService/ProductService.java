package com.brunus.projetoLeLojinha.service.productService;

import com.brunus.projetoLeLojinha.domain.model.person.Person;
import com.brunus.projetoLeLojinha.domain.model.product.Product;
import com.brunus.projetoLeLojinha.domain.model.product.ProductRequestDTO;
import com.brunus.projetoLeLojinha.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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


}
