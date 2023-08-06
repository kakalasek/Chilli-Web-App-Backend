package com.project.chilliwebapp_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/seeds")
public class SeedController {

    @Autowired
    private SeedService seedService;

    @GetMapping
    public ResponseEntity<List<Seed>> getAllSeeds(){
        return new ResponseEntity<>(seedService.allSeeds(), HttpStatus.OK);
    }
}
