package EBNB.Ebnb.controllers;

import EBNB.Ebnb.Repo.RepoShelter;
import EBNB.Ebnb.models.Shelter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shelter")
public class ShelterController {

    @Autowired
    RepoShelter repoShelter;

    @PostMapping
    public ResponseEntity<Shelter> createShelter(@RequestBody Shelter shelter){
        shelter = repoShelter.save(shelter);
        return new ResponseEntity<>(shelter, HttpStatus.CREATED);

    }


}
