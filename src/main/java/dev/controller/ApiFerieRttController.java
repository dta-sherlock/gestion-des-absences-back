package dev.controller;

import dev.entity.FerieRtt;
import dev.repository.FerieRttRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feriertt")
public class ApiFerieRttController {

    @Autowired
    private FerieRttRepository ferttRepo;

    @RequestMapping(method = RequestMethod.GET)
    public List<FerieRtt> ferieRtts() {
        return ferttRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public FerieRtt ferieRttById(@PathVariable Integer id) {
        return ferttRepo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void supprFerieRtt(@PathVariable Integer id) {
        ferttRepo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void ajoutFerieRtt(@RequestBody FerieRtt ferieRtt) {
        ferttRepo.save(ferieRtt);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void modifFerieRtt(@RequestBody FerieRtt ferieRtt) {
        ferttRepo.save(ferieRtt);
    }
}
