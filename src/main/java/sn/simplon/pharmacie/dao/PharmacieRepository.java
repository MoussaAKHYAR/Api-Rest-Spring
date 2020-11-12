package sn.simplon.pharmacie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import sn.simplon.pharmacie.entities.Pharmacie;

import java.util.List;

@RepositoryRestResource
public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {
    @RestResource(path = "/byNom")
    public List<Pharmacie> findByNomContains(@Param("mc") String nom);
}
