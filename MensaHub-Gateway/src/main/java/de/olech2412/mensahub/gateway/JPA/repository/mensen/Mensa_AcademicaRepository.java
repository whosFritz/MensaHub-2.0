package de.olech2412.mensahub.gateway.JPA.repository.mensen;

import de.olech2412.mensahub.models.Leipzig.mensen.Mensa_Academica;
import org.springframework.data.repository.CrudRepository;

/**
 * MensaRepositorys are used to create a connection to the database via Spring Data
 */
public interface Mensa_AcademicaRepository extends CrudRepository<Mensa_Academica, Long> {

    Mensa_Academica findMensa_AcademicaById(Long id);
}