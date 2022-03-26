package com.github.fabriciolfj.domain.service;

import com.github.fabriciolfj.domain.entity.Limit;
import com.github.fabriciolfj.domain.specification.impl.PremiumRole;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
@RequiredArgsConstructor
public class LimiteCreateService {

    private final PremiumRole premiumRole;

    public Limit execute(final BigDecimal balance) {
        var limite = premiumRole.createLimit(balance);
        return limite;
    }
}
