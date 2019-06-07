package org.amrit.api.dao;

import org.amrit.api.entity.PlantDisease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantDiseaseRepository extends JpaRepository<PlantDisease, Long> {
}
