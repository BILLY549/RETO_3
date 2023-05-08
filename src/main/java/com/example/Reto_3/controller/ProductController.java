package com.example.Reto_3.controller;

import com.example.Reto_3.entities.Product;
import com.example.Reto_3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(faltaapi"/api/Product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(faltaapi"/all")
    public List<Product> getAll(){
        return productService.getAll();
    }
    @PostMapping(faltaapi"/save")
    public Product save(@RequestBody Product p){
        return productService.save(p);
    }
}
