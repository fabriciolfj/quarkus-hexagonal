package com.github.fabriciolfj.domain.specification;

import com.github.fabriciolfj.domain.entity.Limit;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class RulesLimitSpecification {

    protected BigDecimal balance;
    protected RulesLimitSpecification next;

    public Limit createLimit(final BigDecimal value) {
        if (this.balance.compareTo(value) >= 0) {
            return createLimit();
        }

        if (Objects.nonNull(next)) {
            return next.createLimit();
        }

        throw new RuntimeException("Roles not defined");

    }

    protected abstract Limit createLimit();
    protected abstract void setBalance();
}
