package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
