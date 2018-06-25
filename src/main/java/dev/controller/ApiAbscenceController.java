package dev.controller;

import dev.entity.Absence;
import dev.repository.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://absences-back.cleverapps.io")
@RequestMapping("/api/absences")
public class ApiAbscenceController {

    @Autowired
    private AbsenceRepository absRepo;

    @RequestMapping(method = RequestMethod.GET)
    public List<Absence> absences() {
        return absRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Absence absenceById(@PathVariable Integer id) {
        return absRepo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void supprAbsence(@PathVariable Integer id) {
        absRepo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void ajoutAbsence(@RequestBody Absence absence) {
        absRepo.save(absence);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void modifAbsence(@RequestBody Absence absence) {
        absRepo.save(absence);
    }
}
