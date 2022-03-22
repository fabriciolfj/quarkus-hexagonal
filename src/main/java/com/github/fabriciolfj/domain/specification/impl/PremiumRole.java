package com.github.fabriciolfj.domain.specification.impl;

import com.github.fabriciolfj.domain.entity.Limit;
import com.github.fabriciolfj.domain.service.LimitBuilder;
import com.github.fabriciolfj.domain.specification.RulesLimitSpecification;

import java.math.BigDecimal;

public class PremiumRole extends RulesLimitSpecification {

    public PremiumRole() {
        this.next = new IntermediaryRole();
        setBalance();
    }

    @Override
    protected Limit createLimit() {
        return LimitBuilder.build()
                .rate(BigDecimal.ONE)
                .withdraw(10)
                .builder();
    }

    @Override
    protected void setBalance() {
        this.balance = BigDecimal.valueOf(10.000);
    }
}
