package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
