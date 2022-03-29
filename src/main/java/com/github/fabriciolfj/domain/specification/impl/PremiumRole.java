package com.github.fabriciolfj.domain.specification.impl;

import com.github.fabriciolfj.domain.builder.LimitBuilder;
import com.github.fabriciolfj.domain.entity.Limit;
import com.github.fabriciolfj.domain.specification.RulesLimitSpecification;

import java.math.BigDecimal;

public class PremiumRole extends RulesLimitSpecification {

    @Override
    protected Limit createLimit() {
        return LimitBuilder.build()
                .rate(BigDecimal.valueOf(2))
                .withdraw(6)
                .builder();
    }

    @Override
    protected BigDecimal getBalance() {
        return BigDecimal.valueOf(10.000);
    }

    @Override
    protected RulesLimitSpecification getNext() {
        return new IntermediaryRole();
    }
}
