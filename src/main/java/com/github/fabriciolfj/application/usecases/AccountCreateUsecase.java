package com.github.fabriciolfj.application.usecases;

import com.github.fabriciolfj.domain.entity.Account;

import java.math.BigDecimal;

public interface AccountCreateUsecase {

    Account execute(final BigDecimal balance);
}
