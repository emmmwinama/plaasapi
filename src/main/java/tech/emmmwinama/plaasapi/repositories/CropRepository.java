package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tech.emmmwinama.plaasapi.models.Crop;

public interface CropRepository extends CrudRepository<Crop, Long> {
    Page<Crop> findByName(@Param("name") String name, Pageable pageable);

    Page<Crop> findByNameAndCategory(@Param("name") String name, @Param("category") String category, Pageable pageable);
}
