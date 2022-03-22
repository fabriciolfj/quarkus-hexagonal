package com.github.fabriciolfj.application.usecases;

import com.github.fabriciolfj.domain.entity.Account;
import com.github.fabriciolfj.domain.vo.TypeDebit;

import java.math.BigDecimal;

public interface AccountDebitUsecase {

    Account execute(final String account, final BigDecimal balance, final TypeDebit typeDebit);
}
