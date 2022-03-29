package com.github.fabriciolfj.application.ports.out;

import com.github.fabriciolfj.domain.entity.Account;

public interface SaveAccountOutput {

    Account execute(final Account account);
}
