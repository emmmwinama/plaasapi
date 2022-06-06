package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Sale;

public interface SaleRepository extends CrudRepository<Sale, Long> {
}
