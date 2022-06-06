package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Field;

public interface FieldRepository extends CrudRepository<Field, Long> {
}
