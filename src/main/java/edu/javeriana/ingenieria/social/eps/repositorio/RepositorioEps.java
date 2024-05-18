package edu.javeriana.ingenieria.social.eps.repositorio;

import edu.javeriana.ingenieria.social.eps.dominio.Eps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEps extends JpaRepository<Eps, Integer> {
    Eps findOneByNombre(String nombre);

    boolean existsByNombre(String nombre);
}
