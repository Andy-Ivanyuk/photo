package voblaweb.photo.repository;

import org.springframework.data.repository.CrudRepository;
import voblaweb.photo.model.HurrySupplies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HurrySuppliesRepository extends CrudRepository<HurrySupplies,Integer> {
}
