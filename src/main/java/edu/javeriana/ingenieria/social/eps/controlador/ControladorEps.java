package edu.javeriana.ingenieria.social.eps.controlador;

import edu.javeriana.ingenieria.social.eps.dominio.Eps;
import edu.javeriana.ingenieria.social.eps.servicio.ServicioEps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/eps")
public class ControladorEps {
    @Autowired
    private ServicioEps servicio;

    @GetMapping("listar")
    public List<Eps> obtenerEps() {
        return servicio.obtenerEps();
    }

    @GetMapping("obtener")
    public ResponseEntity<Eps> obtenerEps(@RequestParam String nombre) {
        if(nombre == null || nombre.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.epsExiste(nombre)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerEps(nombre), HttpStatus.OK);
    }
}
