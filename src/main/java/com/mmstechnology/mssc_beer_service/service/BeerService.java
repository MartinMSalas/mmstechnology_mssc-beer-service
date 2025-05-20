package com.mmstechnology.mssc_beer_service.service;

import com.mmstechnology.mssc_beer_service.web.model.BeerRecord;

import java.util.UUID;

public interface BeerService {

    BeerRecord getBeerById(UUID id);


    BeerRecord updateBeer(UUID beerId, BeerRecord beerRecord);

    BeerRecord createBeer(BeerRecord beerRecord);
}
