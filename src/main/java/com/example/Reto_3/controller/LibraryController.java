package com.example.Reto_3.controller;

import com.example.Reto_3.entities.Library;
import com.example.Reto_3.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/all")
    public List<Library> getAll(){
        return libraryService.getAll();
    }
    @PostMapping("/save")
    public Library save(@RequestBody Library p){
        return libraryService.save(p);
    }
}
