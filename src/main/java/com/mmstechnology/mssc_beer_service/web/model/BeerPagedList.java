package com.mmstechnology.mssc_beer_service.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl<BeerRecord> {

    public BeerPagedList(List<BeerRecord> content) {
        super(content);
    }

    public BeerPagedList(List<BeerRecord> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }
}
