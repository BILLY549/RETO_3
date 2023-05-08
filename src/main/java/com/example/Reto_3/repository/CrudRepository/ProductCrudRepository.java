package com.example.Reto_3.repository.CrudRepository;

import com.example.Reto_3.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
}
