package com.github.fabriciolfj.domain.specification.impl;

import com.github.fabriciolfj.domain.builder.LimitBuilder;
import com.github.fabriciolfj.domain.entity.Limit;
import com.github.fabriciolfj.domain.specification.RulesLimitSpecification;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
@RequiredArgsConstructor
public class IntermediaryRole extends RulesLimitSpecification {

    private final BasicRole basicRole;

    @ConfigProperty(name = "role.intermediary.value")
    private BigDecimal value;

    @ConfigProperty(name = "role.intermediary.rate")
    private BigDecimal rate;

    @ConfigProperty(name = "role.intermediary.withdraw")
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
        this.balance = value;
    }

    @Override
    protected void setNext() {
        this.next = basicRole;
    }
}
