package uk.co.joecastle.msscbrewery.service.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uk.co.joecastle.msscbrewery.web.model.v2.BeerDtoV2;
import uk.co.joecastle.msscbrewery.web.model.v2.BeerStyle;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2
                .builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2
                .builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(String beerId, BeerDtoV2 beerDto) {
        // TODO
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer with id: {}", beerId);
    }

}
