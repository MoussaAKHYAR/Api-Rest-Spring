package sn.simplon.pharmacie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.simplon.pharmacie.entities.Pharmacie;

public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {

}
