package de.olech2412.mensahub.junction.JPA.repository.meals;

import de.olech2412.mensahub.models.Leipzig.meals.Meals_Mensa_am_Elsterbecken;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface Meals_Mensa_am_ElsterbeckenRepository extends CrudRepository<Meals_Mensa_am_Elsterbecken, Long> {

    List<Meals_Mensa_am_Elsterbecken> findAllMealsByServingDateGreaterThanEqual(LocalDate servingDate);

    List<Meals_Mensa_am_Elsterbecken> findAllMealsByServingDate(LocalDate servingDate);

}