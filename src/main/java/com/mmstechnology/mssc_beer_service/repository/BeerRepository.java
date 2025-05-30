package com.mmstechnology.mssc_beer_service.repository;

import com.mmstechnology.mssc_beer_service.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/*
 * BeerRepository.java
 * Project: mmstechnology_mssc-beer-service, Created by M on 30/5/2025.
 * © 2025 mmstechnology
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
