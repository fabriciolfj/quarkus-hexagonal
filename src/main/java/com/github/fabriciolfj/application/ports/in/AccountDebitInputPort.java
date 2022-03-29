package com.github.fabriciolfj.application.ports.in;

import com.github.fabriciolfj.application.usecases.AccountDebitUsecase;
import com.github.fabriciolfj.domain.entity.Account;
import com.github.fabriciolfj.domain.vo.TypeDebit;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
@RequiredArgsConstructor
public class AccountDebitInputPort implements AccountDebitUsecase {

    @Override
    public Account execute(String account, BigDecimal balance, TypeDebit typeDebit) {
        return null;
    }
}
