package com.github.fabriciolfj.adapters.output.postgresql;

import com.github.fabriciolfj.adapters.output.postgresql.repository.data.AccountData;
import com.github.fabriciolfj.adapters.output.postgresql.repository.mapper.AccountDataMapper;
import com.github.fabriciolfj.application.ports.out.SaveAccountOutput;
import com.github.fabriciolfj.domain.entity.Account;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import static java.util.Optional.of;

@ApplicationScoped
@RequiredArgsConstructor
public class AccountAdapterRepository implements SaveAccountOutput, PanacheRepository<AccountData> {

    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Account execute(final Account account) {
        return of(account)
                .map(AccountDataMapper::toData)
                .map(d -> {
                    persist(d);
                    return account;
                })
                .orElseThrow(() -> new RuntimeException("Fail save account"));
    }
}
