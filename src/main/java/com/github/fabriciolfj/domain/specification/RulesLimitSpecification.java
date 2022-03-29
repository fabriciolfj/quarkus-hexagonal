package com.github.fabriciolfj.domain.specification;

import com.github.fabriciolfj.domain.entity.Limit;

import java.math.BigDecimal;

public abstract class RulesLimitSpecification {

    public Limit createLimit(final BigDecimal value) {
        if (this.getBalance().compareTo(value) >= 0) {
            return createLimit();
        }

        return getNext().createLimit();

    }

    protected abstract Limit createLimit();
    protected abstract BigDecimal getBalance();
    protected abstract RulesLimitSpecification getNext();
}
