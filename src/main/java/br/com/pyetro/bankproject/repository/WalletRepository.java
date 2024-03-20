package br.com.pyetro.bankproject.repository;

import br.com.pyetro.bankproject.wallet.Wallet;
import org.springframework.data.repository.CrudRepository;

public interface WalletRepository extends CrudRepository<Wallet, Long> {
}
