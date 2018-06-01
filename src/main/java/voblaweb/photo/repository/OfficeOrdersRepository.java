package voblaweb.photo.repository;

import org.springframework.data.repository.CrudRepository;
import voblaweb.photo.model.OfficeOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeOrdersRepository extends CrudRepository<OfficeOrders,Integer> {
}
