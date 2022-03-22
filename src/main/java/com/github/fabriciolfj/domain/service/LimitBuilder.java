package com.github.fabriciolfj.domain.service;

import com.github.fabriciolfj.domain.entity.Limit;

import java.math.BigDecimal;

public class LimitBuilder {

    private Limit limit;

    public static final LimitBuilder build() {
        return new LimitBuilder();
    }

    public LimitBuilder() {
        this.limit = new Limit();
    }

    public LimitBuilder withdraw(final Integer withdraw) {
        limit.setWithdraw(withdraw);
        return this;
    }

    public LimitBuilder rate(final BigDecimal rate) {
        limit.setRate(rate);
        return this;
    }

    public Limit builder() {
        return limit;
    }
}
