package com.github.fabriciolfj.domain.specification;

import com.github.fabriciolfj.domain.entity.Limit;

import java.math.BigDecimal;

public abstract class RulesLimitSpecification {

    protected BigDecimal balance;
    protected RulesLimitSpecification next;

    public RulesLimitSpecification() {
        setBalance();
        setNext();
    }

    public Limit createLimit(final BigDecimal value) {
        if (this.balance.compareTo(value) >= 0) {
            return createLimit();
        }

        return next.createLimit();

    }

    protected abstract Limit createLimit();
    protected abstract void setBalance();
    protected abstract void setNext();
}
