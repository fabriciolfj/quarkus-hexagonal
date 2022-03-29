package com.github.fabriciolfj.domain.specification;

import java.math.BigDecimal;

public class ValidateBalance {

    public boolean isBalanceValid(final BigDecimal balance) {
        return balance.compareTo(BigDecimal.ZERO) > 1;
    }
}
