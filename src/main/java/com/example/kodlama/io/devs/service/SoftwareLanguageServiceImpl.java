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
        List<SoftwareLanguages>existingLanguage;
        existingLanguage=softwareLanguageRepository.getAll();
        for (SoftwareLanguages forLanguage:existingLanguage){
            if(forLanguage.getName().equalsIgnoreCase(language.getName())){
                throw new Exception(" Lütfen sistemde mevcut olmayan bir dil giriniz !!! ");
            }
            if (language.getName().isEmpty())  throw new Exception(" Lütfen programlama dili giriniz !!! ");
        }
        softwareLanguageRepository.add(language);
    }

     @Override
    public void delete(int id) {
    softwareLanguageRepository.delete(id-1);
    }

    @Override
    public void update(SoftwareLanguages language) {
    softwareLanguageRepository.update(language);
    }
}