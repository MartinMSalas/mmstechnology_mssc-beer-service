package com.mmstechnology.mssc_beer_service.service.impl;

import com.mmstechnology.mssc_beer_service.service.BeerService;
import com.mmstechnology.mssc_beer_service.web.model.BeerRecord;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerRecord getBeerById(UUID beerId) {
        BeerRecord beerRecordFromDb = BeerRecord.builder().beerId(beerId).build();
        return beerRecordFromDb;
    }

    @Override
    public BeerRecord updateBeer(UUID beerId, BeerRecord beerRecord) {
        BeerRecord beerRecordFromDb = beerRecord;
        return beerRecordFromDb;

    }

    @Override
    public BeerRecord createBeer(BeerRecord beerRecord) {
        BeerRecord beerRecordFromDb = beerRecord;
        return beerRecordFromDb;
    }
}
