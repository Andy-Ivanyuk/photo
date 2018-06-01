package voblaweb.photo.repository;

import org.springframework.data.repository.CrudRepository;
import voblaweb.photo.model.Kiosks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KiosksRepository extends CrudRepository<Kiosks,Integer> {
}
