package org.amrit.api.service;

import org.amrit.api.entity.PlantDisease;

import java.util.List;

public interface PlantDiseaseService {

    List<PlantDisease> getAll();

    void save(PlantDisease plantDisease);

    void delete(int id);

    void update(PlantDisease plantDisease);

    PlantDisease getById(int id);

}
