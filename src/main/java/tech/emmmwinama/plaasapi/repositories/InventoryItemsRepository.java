package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Inventory_item;

public interface InventoryItemsRepository extends CrudRepository<Inventory_item, Long> {
}
