package zcslovewensite.priceCal.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import zcslovewensite.priceCal.entity.PriceCal;

import java.util.List;

@Mapper
public interface PriceCalMapper {
    @Select("SELECT * FROM price_cal")
    public List<PriceCal> findAllPriceCal();

    @Select("SELECT * FROM price_cal WHERE id=(SELECT MAX(id) FROM price_cal)")
    public PriceCal findLastPriceCal();

    @Insert("INSERT INTO price_cal\n" +
            "(last_elec_num,this_elec_num,elec_price,last_water_num,this_water_num,water_price,balance,final_price,time)\n" +
            "VALUES\n" +
            "(#{last_elec_num},#{this_elec_num},#{elec_price},#{last_water_num},#{this_water_num},#{water_price},#{balance},#{final_price},NOW())")
    public void addPriceCal(PriceCal priceCal);
}
