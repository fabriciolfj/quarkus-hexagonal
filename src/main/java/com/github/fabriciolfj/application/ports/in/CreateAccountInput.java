package com.github.fabriciolfj.application.ports.in;

import com.github.fabriciolfj.application.ports.out.SaveAccountOutput;
import com.github.fabriciolfj.application.usecases.AccountCreateUsecase;
import com.github.fabriciolfj.domain.entity.Account;
import com.github.fabriciolfj.domain.service.AccountCreateService;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
@RequiredArgsConstructor
public class CreateAccountInput implements AccountCreateUsecase {

    private final AccountCreateService accountCreateService;
    private final SaveAccountOutput saveAccountOutput;

    @Override
    public Account execute(final BigDecimal balance) {
        var account = accountCreateService.execute(balance);
        return saveAccountOutput.execute(account);
    }
}
