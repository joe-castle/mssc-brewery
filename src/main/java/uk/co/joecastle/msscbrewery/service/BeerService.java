package uk.co.joecastle.msscbrewery.service;

import uk.co.joecastle.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(String beerId, BeerDto beerDto);

    void deleteById(UUID beerId);

}
