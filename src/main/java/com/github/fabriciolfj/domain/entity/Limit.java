package com.github.fabriciolfj.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class Limit {

    private String code;
    private Integer withdraw;
    private BigDecimal rate;

    public Limit() {
        this.code = UUID.randomUUID().toString();
    }
}
