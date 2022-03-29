package com.github.fabriciolfj.domain.service;

import com.github.fabriciolfj.domain.entity.Account;
import com.github.fabriciolfj.domain.specification.ValidateBalance;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
@RequiredArgsConstructor
public class AccountCreateService {

    private final LimiteCreateService limiteCreateService;
    private final ValidateBalance validateBalance;

    public Account execute(final BigDecimal balance) {
        if (validateBalance.isBalanceValid(balance)) {
            var limite = limiteCreateService.execute(balance);
            return new Account(balance, limite);
        }

        throw new RuntimeException("Invalid balance: " + balance);
    }
}
