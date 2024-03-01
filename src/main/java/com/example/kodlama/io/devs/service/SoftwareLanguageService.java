package com.example.kodlama.io.devs.service;

import com.example.kodlama.io.devs.entities.SoftwareLanguages;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SoftwareLanguageService {
    List<SoftwareLanguages> getAll();
    SoftwareLanguages getById(int id);

    void add(SoftwareLanguages language) throws Exception;

    void delete(int id);

    void update(SoftwareLanguages softwareLanguages1,SoftwareLanguages softwareLanguages);
}
