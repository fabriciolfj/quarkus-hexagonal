package com.github.fabriciolfj.domain.entity;

import com.github.fabriciolfj.domain.vo.AccountLimitUseVO;
import com.github.fabriciolfj.domain.vo.ExtractVO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Account {

    private String code;
    private BigDecimal balance;
    private List<ExtractVO> extractVOS;
    private AccountLimitUseVO limitUse;

    public Account(final BigDecimal balance, final Limit limit) {
        this.code = UUID.randomUUID().toString();
        this.extractVOS = Arrays.asList(ExtractVO.init(balance));
        this.limitUse = new AccountLimitUseVO(limit);
    }
}
