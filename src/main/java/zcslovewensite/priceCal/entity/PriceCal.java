package zcslovewensite.priceCal.entity;

import java.time.LocalDateTime;

public class PriceCal {
    //id
    private Integer id;

    //本人-上次电表
    private Float last_elec_num;
    //本人-本次电表
    private Float this_elec_num;
    //电费单价
    private Float elec_price;

    //隔壁-上次水表
    private Float last_water_num;
    //隔壁-本次水表
    private Float this_water_num;
    //水费单价
    private Float water_price;

    //其他-(走廊电费-水物业差额)
    private Float balance;

    //交易金额
    private Float final_price;
    //交易时间
    private LocalDateTime time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getLast_elec_num() {
        return last_elec_num;
    }

    public void setLast_elec_num(Float last_elec_num) {
        this.last_elec_num = last_elec_num;
    }

    public Float getThis_elec_num() {
        return this_elec_num;
    }

    public void setThis_elec_num(Float this_elec_num) {
        this.this_elec_num = this_elec_num;
    }

    public Float getElec_price() {
        return elec_price;
    }

    public void setElec_price(Float elec_price) {
        this.elec_price = elec_price;
    }

    public Float getLast_water_num() {
        return last_water_num;
    }

    public void setLast_water_num(Float last_water_num) {
        this.last_water_num = last_water_num;
    }

    public Float getThis_water_num() {
        return this_water_num;
    }

    public void setThis_water_num(Float this_water_num) {
        this.this_water_num = this_water_num;
    }

    public Float getWater_price() {
        return water_price;
    }

    public void setWater_price(Float water_price) {
        this.water_price = water_price;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Float getFinal_price() {
        return final_price;
    }

    public void setFinal_price(Float final_price) {
        this.final_price = final_price;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
