package org.amrit.api.controller;

import org.amrit.api.entity.PlantDisease;
import org.amrit.api.service.PlantDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/plant/disease")
public class PlantDiseaseController {

    @Autowired
    private PlantDiseaseService plantDiseaseService;

    @GetMapping(value = "/getall")
    public List<PlantDisease> getAll() {
        return plantDiseaseService.getAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PlantDisease> getById(@PathVariable("id") Long id){
        Optional<PlantDisease> plantDisease =  plantDiseaseService.getById(id);
        return plantDisease.map(r -> ResponseEntity.ok().body(r)).
                orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping(value = "/save")
    public PlantDisease create(@RequestBody PlantDisease plantDisease) {
        return plantDiseaseService.save(plantDisease);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlantDisease> update(@PathVariable Long id, @RequestBody PlantDisease plantDisease) {
        if (plantDisease.getId() == null || !plantDisease.getId().equals(id)) {
            return ResponseEntity.badRequest().build();
        }

        plantDisease = plantDiseaseService.save(plantDisease);

        return ResponseEntity.ok().body(plantDisease);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        plantDiseaseService.delete(id);
        return ResponseEntity.ok().build();
    }


}
