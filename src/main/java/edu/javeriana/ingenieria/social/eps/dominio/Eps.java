package edu.javeriana.ingenieria.social.eps.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Eps {
    @Id
    private Integer id;
    private String nombre;
}
