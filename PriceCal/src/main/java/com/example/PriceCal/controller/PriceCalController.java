package com.example.PriceCal.controller;

import com.example.PriceCal.dao.PriceCalRepository;
import com.example.PriceCal.entity.PriceCal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/priceCal")
public class PriceCalController {
    @Autowired
    private PriceCalRepository priceCalRepository;

    @RequestMapping("/all")
    public Iterable<PriceCal> all(){
        Iterable<PriceCal> all = priceCalRepository.findAll();
        return all;
    }

    @RequestMapping("/last")
    public PriceCal last(){
        PriceCal last = priceCalRepository.findLast();
        return last;
    }
}
