package com.github.fabriciolfj.domain.service;

import com.github.fabriciolfj.domain.entity.Account;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
@RequiredArgsConstructor
public class AccountCreateService {

    private final LimiteCreateService limiteCreateService;

    public Account execute(final BigDecimal balance) {
        var limite = limiteCreateService.execute(balance);
        return new Account(balance, limite);
    }
}
