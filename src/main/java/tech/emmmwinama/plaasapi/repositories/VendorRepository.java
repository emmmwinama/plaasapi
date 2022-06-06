package tech.emmmwinama.plaasapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.plaasapi.models.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Long> {
}
