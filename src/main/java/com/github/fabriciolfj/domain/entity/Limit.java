package com.github.fabriciolfj.domain.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class Limit {

    private String code;
    private Integer withdraw;
    private BigDecimal rate;

    public Limit() {
        this.code = UUID.randomUUID().toString();
    }

    public void setWithdraw(Integer withdraw) {
        this.withdraw = withdraw;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public Integer getWithdraw() {
        return withdraw;
    }

    public BigDecimal getRate() {
        return rate;
    }
}
