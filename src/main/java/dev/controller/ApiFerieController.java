package dev.controller;

import dev.entity.Ferie;
import dev.repository.FerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/ferie")
public class ApiFerieController {

    @Autowired
    private FerieRepository FerieRepo;

    @RequestMapping(method = RequestMethod.GET, path = "", params = { "annee"} )
    public List<Ferie> FeriesByDateYear(@RequestParam("annee") int annee) {
        return FerieRepo.findAllByYearsDate(annee);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Ferie> Feries() {
        return FerieRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Ferie FerieById(@PathVariable Integer id) {
        return FerieRepo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void supprFerie(@PathVariable Integer id) {
        FerieRepo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void ajoutFerie(@RequestBody Ferie ferie) {
        FerieRepo.save(ferie);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void modifFerie(@RequestBody Ferie ferie) {
        FerieRepo.save(ferie);
    }
}
