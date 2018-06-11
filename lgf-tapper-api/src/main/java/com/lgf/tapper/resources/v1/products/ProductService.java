package com.lgf.tapper.resources.v1.products;

import com.lgf.tapper.domain.Product;
import com.lgf.tapper.resources.v1.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public List<Product> getAll(){
        return(repository.findAll());
    }

}
