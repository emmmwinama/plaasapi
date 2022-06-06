package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
