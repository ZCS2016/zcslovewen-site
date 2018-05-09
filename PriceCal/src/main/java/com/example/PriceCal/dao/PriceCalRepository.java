package com.example.PriceCal.dao;

import com.example.PriceCal.entity.PriceCal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PriceCalRepository extends CrudRepository<PriceCal,Integer> {
    @Query("SELECT pc FROM PriceCal pc WHERE pc.id=(SELECT MAX(pc.id) FROM PriceCal pc)")
    PriceCal findLast();
}
