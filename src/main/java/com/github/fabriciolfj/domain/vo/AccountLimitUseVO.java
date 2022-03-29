package com.github.fabriciolfj.domain.vo;

import com.github.fabriciolfj.domain.entity.Limit;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class AccountLimitUseVO {

    private String code;
    private Integer withdraw;
    private BigDecimal rate;

    public AccountLimitUseVO(final Limit limit) {
        this.code = UUID.randomUUID().toString();
        this.withdraw = limit.getWithdraw();
        this.rate = limit.getRate();
    }
}
