package zcslovewensite.priceCal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zcslovewensite.priceCal.entity.PriceCal;
import zcslovewensite.priceCal.service.PriceCalService;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/api/priceCal")
public class PriceCalController {
    @Autowired
    private PriceCalService priceCalService;

    @RequestMapping("/all")
    @ResponseBody
    public List<PriceCal> findAllPriceCal(){
        return priceCalService.findAllPriceCal();
    }

    @RequestMapping("/last")
    @ResponseBody
    public PriceCal findLastPriceCal(){
        return priceCalService.findLastPriceCal();
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addPriceCal(){
        Random random = new Random();
        float nextFloat = random.nextFloat();

        PriceCal priceCal = new PriceCal();
        priceCal.setLast_elec_num(nextFloat);
        priceCal.setThis_elec_num(nextFloat);
        priceCal.setElec_price(nextFloat);

        priceCal.setLast_water_num(nextFloat);
        priceCal.setThis_water_num(nextFloat);
        priceCal.setWater_price(nextFloat);

        priceCal.setBalance(nextFloat);

        priceCal.setFinal_price(nextFloat);

        priceCalService.addPriceCal(priceCal);
        return "success";
    }

}
