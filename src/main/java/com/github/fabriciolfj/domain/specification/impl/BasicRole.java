package com.github.fabriciolfj.domain.specification.impl;

import com.github.fabriciolfj.domain.entity.Limit;
import com.github.fabriciolfj.domain.service.LimitBuilder;
import com.github.fabriciolfj.domain.specification.RulesLimitSpecification;

import java.math.BigDecimal;

public class BasicRole extends RulesLimitSpecification {

    public BasicRole() {
        setBalance();
    }

    @Override
    protected Limit createLimit() {
        return LimitBuilder.build()
                .rate(BigDecimal.valueOf(7.6))
                .withdraw(2)
                .builder();
    }

    @Override
    protected void setBalance() {
        this.balance = BigDecimal.valueOf(0);
    }
}
