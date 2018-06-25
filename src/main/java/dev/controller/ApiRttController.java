package dev.controller;

import dev.entity.Rtt;
import dev.repository.RttRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://dta-sherlock.github.io/gestion-des-absences-front/")
@RequestMapping("/api/rtt")
public class ApiRttController {

    @Autowired
    private RttRepository rttRepo;

    @RequestMapping(method = RequestMethod.GET)
    public List<Rtt> Rtts() {
        return rttRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Rtt RttById(@PathVariable Integer id) {
        return rttRepo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void supprRtt(@PathVariable Integer id) {
        rttRepo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void ajoutRtt(@RequestBody Rtt rtt) {
        rttRepo.save(rtt);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void modifRtt(@RequestBody Rtt rtt) {
        rttRepo.save(rtt);
    }
}
