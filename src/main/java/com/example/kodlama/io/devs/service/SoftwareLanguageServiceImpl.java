package com.example.kodlama.io.devs.service;

import com.example.kodlama.io.devs.entities.SoftwareLanguages;
import com.example.kodlama.io.devs.repository.abstracts.SoftwareLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class SoftwareLanguageServiceImpl implements SoftwareLanguageService {
private SoftwareLanguageRepository softwareLanguageRepository;
@Autowired
public SoftwareLanguageServiceImpl(SoftwareLanguageRepository softwareLanguageRepository){
    this.softwareLanguageRepository=softwareLanguageRepository;
}
    @Override
    public List<SoftwareLanguages> getAll() {
        return softwareLanguageRepository.getAll();
    }

    @Override
    public SoftwareLanguages getById(int id) {
        return softwareLanguageRepository.getById(id);
    }
//sdlkaşljfdd
    @Override
    public void add(SoftwareLanguages language) throws Exception {
        List<SoftwareLanguages>temp;
        temp=softwareLanguageRepository.getAll();
        for (SoftwareLanguages warelang:temp){
            if(warelang.getName().equalsIgnoreCase(language.getName())){
                throw new Exception(" Please enter a new Software language !");
            }
            if (language.getName().isEmpty())  throw new Exception(" Software language cannot be null !");
        }
        softwareLanguageRepository.add(language);
    }


     @Override
    public void delete(int id) {
    softwareLanguageRepository.delete(id-1);
    }

    @Override
    public void update(SoftwareLanguages softwareLanguages1,SoftwareLanguages softwareLanguages) {
    softwareLanguageRepository.update(softwareLanguages1,softwareLanguages);
    }
}