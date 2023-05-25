package com.essensGetter.api.JPA.repository.meals;

import com.essensGetter.api.JPA.entities.meals.Meals_Mensa_Peterssteinweg;
import com.essensGetter.api.JPA.entities.meals.Meals_Mensa_am_Park;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface Meals_Mensa_PeterssteinwegRepository extends CrudRepository<Meals_Mensa_Peterssteinweg, Long> {

    List<Meals_Mensa_Peterssteinweg> findAllMealsByServingDateGreaterThanEqual(LocalDate servingDate);

    List<Meals_Mensa_Peterssteinweg> findAllByServingDateGreaterThanEqualAndServingDateLessThanEqualOrderByServingDate(LocalDate startDate, LocalDate endDate);

    List<Meals_Mensa_Peterssteinweg> findAllMealsByServingDate(LocalDate servingDate);

    List<Meals_Mensa_Peterssteinweg> findByNameAndServingDateAndId(String name, LocalDate servingDate, Long id);

    List<Meals_Mensa_Peterssteinweg> findAllByCategory(String category);

    List<Meals_Mensa_Peterssteinweg> findAllByCategoryAndServingDate(String category, LocalDate servingDate);

    List<Meals_Mensa_Peterssteinweg> findAllByRatingLessThanEqual(Double rating);

    List<Meals_Mensa_Peterssteinweg> findAllByRatingGreaterThanEqual(Double rating);

}