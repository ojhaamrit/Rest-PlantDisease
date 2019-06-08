package org.amrit.api.service;

import org.amrit.api.entity.PlantDisease;

import java.util.List;
import java.util.Optional;

public interface PlantDiseaseService {

    List<PlantDisease> getAll();

    PlantDisease save(PlantDisease plantDisease);

    void delete(Long id);

    Optional<PlantDisease> getById(Long id);

}
