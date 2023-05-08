package com.example.Reto_3.controller;

import com.example.Reto_3.entities.Category;
import com.example.Reto_3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(faltaapi"/api/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping(faltaapi"/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @PostMapping(faltaapi"/save")
    public Category save(@RequestBody Category p){
        return categoryService.save(p);
    }
}
