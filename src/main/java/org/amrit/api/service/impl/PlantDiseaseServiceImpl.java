package org.amrit.api.service.impl;

import org.amrit.api.dao.PlantDiseaseRepository;
import org.amrit.api.entity.PlantDisease;
import org.amrit.api.service.PlantDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantDiseaseServiceImpl implements PlantDiseaseService {

    @Autowired
    private PlantDiseaseRepository plantDiseaseRepository;

    @Override
    public List<PlantDisease> getAll() {
        return plantDiseaseRepository.findAll();
    }

    @Override
    public PlantDisease save(PlantDisease plantDisease) {
        return plantDiseaseRepository.save(plantDisease);
    }

    @Override
    public void delete(Long id) {
        PlantDisease p = plantDiseaseRepository.getOne(id);
        plantDiseaseRepository.delete(p);
    }

    @Override
    public Optional<PlantDisease> getById(Long id) {
        return plantDiseaseRepository.findById(id);
    }

}
