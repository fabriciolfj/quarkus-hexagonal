package com.github.fabriciolfj.adapters.output.postgresql.repository.data;

import com.github.fabriciolfj.domain.entity.Limit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "account")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AccountData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code")
    private String code;
    private BigDecimal balance;
    private Integer withdraw;
    private BigDecimal rate;
    @OneToMany(mappedBy = "account", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<ExtractData> extracts;
}
