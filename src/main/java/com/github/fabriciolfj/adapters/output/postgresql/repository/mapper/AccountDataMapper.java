package com.github.fabriciolfj.adapters.output.postgresql.repository.mapper;

import com.github.fabriciolfj.adapters.output.postgresql.repository.data.AccountData;
import com.github.fabriciolfj.adapters.output.postgresql.repository.data.ExtractData;
import com.github.fabriciolfj.domain.entity.Account;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class AccountDataMapper {

    private AccountDataMapper() { }

    public static final AccountData toData(final Account account) {
        final var accountData = AccountData.builder()
                .balance(account.getBalance())
                .code(account.getCode())
                .rate(account.getRate())
                .withdraw(account.getWithdraw())
                .build();

        accountData.setExtracts(Arrays.asList(toExtract(accountData)));
        return accountData;
    }

    private static final ExtractData toExtract(final AccountData data) {
        return ExtractData.builder()
                .account(data)
                .description("init account")
                .exit(BigDecimal.ZERO)
                .balance(data.getBalance())
                .entrance(data.getBalance())
                .movimentDate(LocalDateTime.now())
                .build();
    }
}
