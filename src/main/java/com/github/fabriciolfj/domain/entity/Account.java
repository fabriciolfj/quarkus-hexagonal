package com.github.fabriciolfj.domain.entity;

import com.github.fabriciolfj.domain.vo.Extract;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Account {

    private String code;
    private BigDecimal balance;
    private Limit limit;
    private List<Extract> extracts;

    public Account(final BigDecimal balance) {
        this.code = UUID.randomUUID().toString();
        this.extracts = Arrays.asList(Extract.init(balance));
    }

    public String getCode() {
        return code;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<Extract> getExtracts() {
        return extracts;
    }
}
