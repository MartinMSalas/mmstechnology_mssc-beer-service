package com.mmstechnology.mssc_beer_service.web.controller;

import com.mmstechnology.mssc_beer_service.service.BeerService;
import com.mmstechnology.mssc_beer_service.web.model.BeerRecord;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {


    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }


    @GetMapping("/{beerId}")
    public ResponseEntity<BeerRecord> getBeerById(@PathVariable("beerId") UUID beerId){

        BeerRecord beerRecord = beerService.getBeerById(beerId);

        return new ResponseEntity<>(beerRecord, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerRecord> saveNewBeer(@RequestBody BeerRecord beerRecord){

        BeerRecord beerRecordFromDb = beerService.createBeer(beerRecord);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerRecord> updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerRecord beerRecord){

        BeerRecord beerRecordFromDb = beerService.updateBeer(beerId, beerRecord);


        return new ResponseEntity<>(beerRecordFromDb,HttpStatus.OK);
    }
}
