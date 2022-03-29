package com.github.fabriciolfj.domain.policy;

import java.math.BigDecimal;

public class UpdateLimitUsePolicy {

    public void isBalanceValid(final BigDecimal balance) {
        if (balance.compareTo(BigDecimal.ZERO) <= 1) {
            throw new IllegalArgumentException("Balance invalid: " + balance);
        }
    }
}
