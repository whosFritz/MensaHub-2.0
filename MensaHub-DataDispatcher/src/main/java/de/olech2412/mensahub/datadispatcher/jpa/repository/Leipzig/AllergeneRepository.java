package de.olech2412.mensahub.datadispatcher.jpa.repository.Leipzig;

import de.olech2412.mensahub.models.Leipzig.Allergene;
import org.springframework.data.repository.CrudRepository;

public interface AllergeneRepository extends CrudRepository<Allergene, Long> {
}