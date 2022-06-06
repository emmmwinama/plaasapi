package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Inventory_category;

public interface InventoryCategoryRepository extends CrudRepository<Inventory_category, Long> {
}
