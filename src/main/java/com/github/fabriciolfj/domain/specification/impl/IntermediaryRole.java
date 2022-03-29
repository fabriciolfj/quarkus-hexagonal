package com.github.fabriciolfj.domain.specification.impl;

import com.github.fabriciolfj.domain.builder.LimitBuilder;
import com.github.fabriciolfj.domain.entity.Limit;
import com.github.fabriciolfj.domain.specification.RulesLimitSpecification;
import java.math.BigDecimal;

public class IntermediaryRole extends RulesLimitSpecification {

    @Override
    protected Limit createLimit() {
        return LimitBuilder.build()
                .rate(BigDecimal.valueOf(5.4))
                .withdraw(5)
                .builder();
    }

    @Override
    protected BigDecimal getBalance() {
        return BigDecimal.valueOf(5.000);
    }

    @Override
    protected RulesLimitSpecification getNext() {
        return new BasicRole();
    }
}
