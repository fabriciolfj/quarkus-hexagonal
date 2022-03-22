package com.github.fabriciolfj.domain.specification.impl;

import com.github.fabriciolfj.domain.entity.Limit;
import com.github.fabriciolfj.domain.service.LimitBuilder;
import com.github.fabriciolfj.domain.specification.RulesLimitSpecification;

import java.math.BigDecimal;

public class IntermediaryRole extends RulesLimitSpecification {

    public IntermediaryRole() {
        this.next = new BasicRole();
        setBalance();
    }

    @Override
    protected Limit createLimit() {
        return LimitBuilder.build()
                .rate(BigDecimal.valueOf(5))
                .withdraw(5)
                .builder();
    }

    @Override
    protected void setBalance() {
        this.balance = BigDecimal.valueOf(5.000);
    }
}
