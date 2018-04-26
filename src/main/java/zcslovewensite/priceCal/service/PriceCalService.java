package zcslovewensite.priceCal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zcslovewensite.priceCal.dao.PriceCalMapper;
import zcslovewensite.priceCal.entity.PriceCal;

import java.util.List;

@Service
public class PriceCalService {
    @Autowired
    private PriceCalMapper priceCalMapper;

    public List<PriceCal> findAllPriceCal(){
        return priceCalMapper.findAllPriceCal();
    }

    public PriceCal findLastPriceCal(){
        return  priceCalMapper.findLastPriceCal();
    }

    public void addPriceCal(PriceCal priceCal){
        priceCalMapper.addPriceCal(priceCal);
    }

    public void setPriceCalMapper(PriceCalMapper priceCalMapper) {
        this.priceCalMapper = priceCalMapper;
    }
}
