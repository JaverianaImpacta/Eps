package edu.javeriana.ingenieria.social.eps.servicio;


import edu.javeriana.ingenieria.social.eps.dominio.Eps;
import edu.javeriana.ingenieria.social.eps.repositorio.RepositorioEps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEps {

    @Autowired
    private RepositorioEps repositorio;

    public List<Eps> obtenerEps() {
        return repositorio.findAll();
    }

    public Eps obtenerEps(String nombre) {
        return repositorio.findOneByNombre(nombre);
    }

    public boolean epsExiste(String nombre){
        return repositorio.existsByNombre(nombre);
    }
}
