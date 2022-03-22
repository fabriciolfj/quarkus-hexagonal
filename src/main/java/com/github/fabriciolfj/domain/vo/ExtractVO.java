package com.github.fabriciolfj.domain.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ExtractVO {

    private BigDecimal entrance;
    private BigDecimal exit;
    private LocalDateTime movimentDate;
    private String description;
    private BigDecimal balance;

    private ExtractVO(final BigDecimal value) {
        this.entrance = value;
        this.exit = BigDecimal.ZERO;
        this.movimentDate = LocalDateTime.now();
        this.description = "Init account";
        this.balance = value;
    }

    public static final ExtractVO init(final BigDecimal value) {
        return new ExtractVO(value);
    }
}
