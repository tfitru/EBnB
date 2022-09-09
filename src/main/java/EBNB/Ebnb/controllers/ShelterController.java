package EBNB.Ebnb.controllers;

import EBNB.Ebnb.Repo.RepoShelter;
import EBNB.Ebnb.models.Shelter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shelter")
public class ShelterController {

    @Autowired
    RepoShelter

    @PostMapping
    public ResponseEntity<Shelter> createShelter(@RequestBody Shelter shelter){

    }


}
