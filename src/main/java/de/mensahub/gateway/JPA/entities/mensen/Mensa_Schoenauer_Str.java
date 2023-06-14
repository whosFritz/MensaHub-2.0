package de.mensahub.gateway.JPA.entities.mensen;

import de.mensahub.gateway.JPA.entities.MailUser;
import de.mensahub.gateway.JPA.entities.meals.Meals_Schoenauer_Str;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "mensa_schoenauer_str")
/**
 * Used to create a Mensa Schoenauer Str
 */
public class Mensa_Schoenauer_Str extends Mensa {

    @OneToMany(mappedBy = "mensa_schoenauer_str")
    private Set<Meals_Schoenauer_Str> meals_schoenauer_strList; // Many Meals can be in one Cafeteria

    @OneToMany(mappedBy = "mensa_schoenauer_str", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<MailUser> mail_users; // Many MailUsers can be in one Cafeteria
}