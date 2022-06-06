package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Expense_item;

public interface ExpenseItemRepository extends CrudRepository<Expense_item, Long> {
}
