package sn.simplon.pharmacie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.simplon.pharmacie.dao.PharmacieRepository;
import sn.simplon.pharmacie.entities.Pharmacie;

import java.util.List;

@RestController
public class PharmacieRestService {
    @Autowired
    private PharmacieRepository pharmacieRepository;
    @GetMapping(value = "/listePharmacies")
    public List<Pharmacie> listeProduits(){
        return pharmacieRepository.findAll();
    }

    @PostMapping(value = "/listePharmacies")
    public Pharmacie save(@RequestBody Pharmacie p){
        return pharmacieRepository.save(p);
    }

    @PutMapping(value = "/listePharmacies/{id}")
    public Pharmacie update(@PathVariable(name = "id") int id, @RequestBody Pharmacie p){
        p.setId(id);
        return pharmacieRepository.save(p);
    }

    @DeleteMapping(value = "/listePharmacies/{id}")
    public void delete(@PathVariable(name = "id") int id){
        pharmacieRepository.deleteById(id);
    }
}
