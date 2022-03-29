package com.github.fabriciolfj.domain.specification.impl;

import com.github.fabriciolfj.domain.builder.LimitBuilder;
import com.github.fabriciolfj.domain.entity.Limit;
import com.github.fabriciolfj.domain.specification.RulesLimitSpecification;

import java.math.BigDecimal;

public class BasicRole extends RulesLimitSpecification {

    @Override
    protected Limit createLimit() {
        return LimitBuilder.build()
                .rate(BigDecimal.valueOf(9.8))
                .withdraw(2)
                .builder();
    }

    @Override
    protected BigDecimal getBalance() {
        return BigDecimal.valueOf(0);
    }

    @Override
    protected RulesLimitSpecification getNext() {
        throw new RuntimeException("Rule limite not found");
    }
}
