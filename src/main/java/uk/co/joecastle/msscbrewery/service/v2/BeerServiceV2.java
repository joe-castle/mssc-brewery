package uk.co.joecastle.msscbrewery.service.v2;

import uk.co.joecastle.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(String beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);

}
