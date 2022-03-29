package com.github.fabriciolfj.adapters.output.postgresql.repository.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "extract")
public class ExtractData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal entrance;
    private BigDecimal exit;
    @Column(name = "moviment_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime movimentDate;
    private String description;
    private BigDecimal balance;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountData account;
}
