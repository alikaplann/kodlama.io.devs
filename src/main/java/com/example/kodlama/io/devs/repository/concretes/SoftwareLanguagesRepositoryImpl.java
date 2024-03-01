package com.example.kodlama.io.devs.repository.concretes;

import com.example.kodlama.io.devs.entities.SoftwareLanguages;
import com.example.kodlama.io.devs.repository.abstracts.SoftwareLanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class SoftwareLanguagesRepositoryImpl implements SoftwareLanguageRepository {

    List<SoftwareLanguages> softwareLanguage = new ArrayList<>();

    public SoftwareLanguagesRepositoryImpl() {
        softwareLanguage = new ArrayList<SoftwareLanguages>();
        softwareLanguage.add(new SoftwareLanguages(1, "C#"));
        softwareLanguage.add(new SoftwareLanguages(2, "Java"));
        softwareLanguage.add(new SoftwareLanguages(3, "Python"));

    }

    @Override
    public List<SoftwareLanguages> getAll() {
        return softwareLanguage;
    }

    @Override
    public void add(SoftwareLanguages softwareLanguages) {
        softwareLanguage.add(softwareLanguages);


    }

    @Override
    public SoftwareLanguages getById(int id) {
        return softwareLanguage.get(id);
    }

    @Override
    public void delete(int id) {

        softwareLanguage.remove(id);
    }

    @Override
    public void update(SoftwareLanguages softwareLanguages1, SoftwareLanguages softwareLanguages) {
        int index = softwareLanguage.indexOf(getById(softwareLanguages1.getId()));
        if (index != -1) {
            softwareLanguage.set(index, softwareLanguages);
        }
    }
}