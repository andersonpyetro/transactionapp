package br.com.pyetro.bankproject.repository;

import br.com.pyetro.bankproject.transaction.Transaction;
import org.springframework.data.repository.ListCrudRepository;

public interface TransactionRepository extends ListCrudRepository<Transaction, Long> {
}
