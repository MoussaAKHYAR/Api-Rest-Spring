package sn.simplon.pharmacie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.simplon.pharmacie.entities.Pharmacie;

@RepositoryRestResource
public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {

}
