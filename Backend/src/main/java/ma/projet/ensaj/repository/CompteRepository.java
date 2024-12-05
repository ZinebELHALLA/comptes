package ma.projet.ensaj.repository;

import ma.projet.ensaj.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
