package com.github.fabriciolfj.adapters.input.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {

    private String code;
    private BigDecimal balance;
    private Integer withdraw;
    private BigDecimal rate;
}
