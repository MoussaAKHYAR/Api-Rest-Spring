package sn.simplon.pharmacie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.simplon.pharmacie.dao.PharmacieRepository;
import sn.simplon.pharmacie.entities.Pharmacie;

import java.util.List;

@RestController
public class PharmacieRestService {
    @Autowired
    private PharmacieRepository pharmacieRepository;
    @GetMapping(value = "/listeProduits")
    public List<Pharmacie> listeProduits(){
        return pharmacieRepository.findAll();
    }
}
