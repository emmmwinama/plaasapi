package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
