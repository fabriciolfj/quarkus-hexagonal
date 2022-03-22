package com.github.fabriciolfj.domain.vo;

import com.github.fabriciolfj.domain.entity.Account;
import com.github.fabriciolfj.domain.entity.Limit;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class AccountLimitUseVO {

    private String code;
    private Limit limit;
    private Integer withdraw;
    private BigDecimal rate;

    public AccountLimitUseVO(final Limit limit, final Account account, final Integer withdraw, final BigDecimal rate) {
        this.code = UUID.randomUUID().toString();
        this.limit = limit;
        this.withdraw = withdraw;
        this.rate = rate;
    }
}
