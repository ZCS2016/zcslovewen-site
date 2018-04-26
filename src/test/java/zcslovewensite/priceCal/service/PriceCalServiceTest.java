package zcslovewensite.priceCal.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zcslovewensite.priceCal.entity.PriceCal;

import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PriceCalServiceTest {
    @Autowired
    private PriceCalService priceCalService;

    @Test
    public void findAllPriceCalTest(){
        List<PriceCal> allPriceCal = priceCalService.findAllPriceCal();
        System.out.println("http://localhost:8080/api/priceCal/all");
    }

    @Test
    public void findLastPriceCalTest(){
        PriceCal lastPriceCal = priceCalService.findLastPriceCal();
        System.out.println("http://localhost:8080/api/priceCal/last");
    }

    @Test
    public void addPriceCalTest(){
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
        System.out.println("http://localhost:8080/api/priceCal/add");
    }

}
