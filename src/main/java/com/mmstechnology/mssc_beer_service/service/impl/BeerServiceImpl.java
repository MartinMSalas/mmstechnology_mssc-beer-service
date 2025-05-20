package com.mmstechnology.mssc_beer_service.service.impl;

import com.mmstechnology.mssc_beer_service.service.BeerService;
import com.mmstechnology.mssc_beer_service.web.model.BeerRecord;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {

    @Override
    public BeerRecord getBeerById(UUID id) {
        BeerRecord.builder().build();
        return null;
    }

    @Override
    public BeerRecord updateBeer(UUID beerId, BeerRecord beerRecord) {
        return null;
    }

    @Override
    public BeerRecord createBeer(BeerRecord beerRecord) {

        return null;
    }
}
