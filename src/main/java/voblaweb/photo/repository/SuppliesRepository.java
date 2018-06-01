package voblaweb.photo.repository;

import org.springframework.data.repository.CrudRepository;
import voblaweb.photo.model.Supplies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuppliesRepository extends CrudRepository<Supplies,Integer> {
}
