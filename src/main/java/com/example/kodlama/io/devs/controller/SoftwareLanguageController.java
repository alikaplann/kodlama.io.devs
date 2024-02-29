package com.example.kodlama.io.devs.controller;


import com.example.kodlama.io.devs.entities.SoftwareLanguages;
import com.example.kodlama.io.devs.service.SoftwareLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // annotation
@RequestMapping("/api")
public class SoftwareLanguageController {
    private SoftwareLanguageService softwareLanguageService;

    @Autowired
    public SoftwareLanguageController(SoftwareLanguageService softwareLanguageService) {
        this.softwareLanguageService = softwareLanguageService;
    }

    @GetMapping("/getall")
    public List<SoftwareLanguages> getAll() {
        return softwareLanguageService.getAll();
    }
    @PostMapping("/add")
    public void add( @RequestBody SoftwareLanguages softwareLanguages) throws Exception {
        softwareLanguageService.add(softwareLanguages);
    }
    @PostMapping("/getById")
    public SoftwareLanguages getById(@PathVariable int id) {
        return softwareLanguageService.getById(id);
    }
    @PostMapping("/delete")
    public void delete(@PathVariable int id){
       softwareLanguageService.delete(id);
    }
    @PostMapping("/update")
    public void update(@RequestBody SoftwareLanguages softwareLanguages){
        softwareLanguageService.update(softwareLanguages);
    }
}