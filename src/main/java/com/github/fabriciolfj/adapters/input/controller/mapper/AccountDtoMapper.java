package com.github.fabriciolfj.adapters.input.controller.mapper;

import com.github.fabriciolfj.adapters.input.controller.dto.AccountResponse;
import com.github.fabriciolfj.domain.entity.Account;

public class AccountDtoMapper {

    private AccountDtoMapper() { }

    public static AccountResponse toResponse(final Account account) {
        return AccountResponse
                .builder()
                .balance(account.getBalance())
                .code(account.getCode())
                .rate(account.getRate())
                .withdraw(account.getWithdraw())
                .build();
    }
}
