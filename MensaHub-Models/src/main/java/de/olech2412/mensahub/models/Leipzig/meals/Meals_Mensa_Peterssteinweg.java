package de.olech2412.mensahub.models.Leipzig.meals;

import de.olech2412.mensahub.models.Leipzig.mensen.Mensa_Peterssteinweg;
import de.olech2412.mensahub.models.Meal;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * This class represents the meals_mensa_peterssteinweg entity in the database.
 */
@Getter
@Setter
@Entity
@Table(name = "meals_mensa_peterssteinweg")
public class Meals_Mensa_Peterssteinweg extends Meal {

    @ManyToOne
    @JoinColumn(name = "mensa_peterssteinweg_id", nullable = false)
    private Mensa_Peterssteinweg mensa_peterssteinweg;

    public Meals_Mensa_Peterssteinweg() {

    }

}
