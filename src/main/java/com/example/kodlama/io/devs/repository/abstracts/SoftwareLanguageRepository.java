package com.example.kodlama.io.devs.repository.abstracts;

import com.example.kodlama.io.devs.entities.SoftwareLanguages;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SoftwareLanguageRepository {
    List<SoftwareLanguages> getAll();
    void add(SoftwareLanguages softwareLanguages);

    SoftwareLanguages getById(int id);


    void delete(int id);

    void update(SoftwareLanguages softwareLanguages1,SoftwareLanguages softwareLanguages);
}
