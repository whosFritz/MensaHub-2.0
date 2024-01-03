package de.olech2412.mensahub.gateway.JPA.services.mensen;

import de.olech2412.mensahub.gateway.JPA.repository.mensen.Mensa_PeterssteinwegRepository;
import de.olech2412.mensahub.models.Leipzig.mensen.Mensa_Peterssteinweg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mensa_PeterssteinwegService extends Mensa_Service {

    @Autowired
    Mensa_PeterssteinwegRepository mensa_peterssteinwegRepository;

    /**
     * @return Mensa Peterssteinweg as Iterable
     */
    @Override
    public Iterable<Mensa_Peterssteinweg> findAll() {
        return mensa_peterssteinwegRepository.findAll();
    }

    /**
     * @return Mensa Peterssteinweg
     */
    @Override
    public Mensa_Peterssteinweg getMensa() {
        return mensa_peterssteinwegRepository.findMensa_PeterssteinwegById(1L); // There is only one Mensa Peterssteinweg
    }
}

