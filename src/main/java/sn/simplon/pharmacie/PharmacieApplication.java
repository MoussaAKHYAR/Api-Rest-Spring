package sn.simplon.pharmacie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.simplon.pharmacie.dao.PharmacieRepository;
import sn.simplon.pharmacie.entities.Pharmacie;

@SpringBootApplication
public class PharmacieApplication implements CommandLineRunner {

    @Autowired
    private PharmacieRepository pharmacieRepository;
    public static void main(String[] args) {
        SpringApplication.run(PharmacieApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // pharmacieRepository.save(new Pharmacie(0,"pharma1","medina","dakar",1));
    }
}
