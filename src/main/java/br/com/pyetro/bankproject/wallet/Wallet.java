package br.com.pyetro.bankproject.wallet;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Table("WALLET")
public record Wallet(
        @Id Long id,
        String Name,
        Long cpf,
        String email,
        String password,
        int type,
        BigDecimal balance,
        @Version Long version

        ) {

    public Wallet debit(BigDecimal value){
        return new Wallet(id, Name, cpf, email, password, type, balance.subtract(value), version);
    }
    public Wallet credit(BigDecimal value){
        return new Wallet(id, Name, cpf, email, password, type, balance.add(value), version);
    }
}
