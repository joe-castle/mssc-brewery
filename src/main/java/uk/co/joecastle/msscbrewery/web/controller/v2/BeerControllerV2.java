package uk.co.joecastle.msscbrewery.web.controller.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import uk.co.joecastle.msscbrewery.service.v2.BeerServiceV2;
import uk.co.joecastle.msscbrewery.web.model.BeerDto;
import uk.co.joecastle.msscbrewery.web.model.v2.BeerDtoV2;

import java.net.URI;
import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    @Autowired
    public BeerControllerV2(BeerServiceV2 beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable UUID beerId) {
        return ResponseEntity
                .ok(beerService.getBeerById(beerId));
    }

    @PostMapping
    public ResponseEntity<Void> handlePost(@RequestBody BeerDtoV2 beerDto) {
        BeerDtoV2 saveDto = beerService.saveNewBeer(beerDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .build(saveDto.getId());

        return ResponseEntity
                .created(location)
                .build();
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> handleUpdate(@PathVariable String beerId, @RequestBody BeerDtoV2 beerDto) {
        beerService.updateBeer(beerId, beerDto);

        return ResponseEntity
                .noContent()
                .build();
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId) {
        beerService.deleteById(beerId);
    }

}
