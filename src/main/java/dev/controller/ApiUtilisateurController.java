package dev.controller;

import dev.entity.Utilisateur;
import dev.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/utilisateurs")
public class ApiUtilisateurController {

    @Autowired
    private UtilisateurRepository utiliRepo;

    @RequestMapping(method = RequestMethod.GET)
    public List<Utilisateur> utilisateurs() {
        return utiliRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "", params = { "email", "mdp" } )
    public Utilisateur utilisateurByEmailAndMdp(@RequestParam("email") String email, @RequestParam("mdp") String mdp ) {
        return utiliRepo.findByEmailAndMdp(email, mdp);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Utilisateur utilisateurById(@PathVariable Integer id) {
        return utiliRepo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void supprUtilisaeur(@PathVariable Integer id) {
        utiliRepo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void ajoutUtilisaeur(@RequestBody Utilisateur utilisateur) {
        utiliRepo.save(utilisateur);
    }
}