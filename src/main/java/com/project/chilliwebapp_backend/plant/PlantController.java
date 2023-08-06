package com.project.chilliwebapp_backend.plant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/plants")
public class PlantController {

    @Autowired
    private PlantService plantService;

    @GetMapping
    public ResponseEntity<List<Plant>> getAllPlants(){
        return new ResponseEntity<>(plantService.allPlants(), HttpStatus.OK);
    }

    public ResponseEntity<Plant> createPlant(@RequestBody Plant plant){
        return new ResponseEntity<>(plant, HttpStatus.CREATED);
    }
}