package com.github.fabriciolfj.domain.specification.impl;

import com.github.fabriciolfj.domain.entity.Limit;
import com.github.fabriciolfj.domain.builder.LimitBuilder;
import com.github.fabriciolfj.domain.specification.RulesLimitSpecification;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
public class BasicRole extends RulesLimitSpecification {

    @ConfigProperty(name = "role.premium.rate")
    private BigDecimal rate;

    @ConfigProperty(name = "role.premium.withdraw")
    private Integer withdraw;

    @Override
    protected Limit createLimit() {
        return LimitBuilder.build()
                .rate(rate)
                .withdraw(withdraw)
                .builder();
    }

    @Override
    protected void setBalance() {
        this.balance = BigDecimal.valueOf(0);
    }

    @Override
    protected void setNext() {
        throw new RuntimeException("Rule limite not found");
    }
}
