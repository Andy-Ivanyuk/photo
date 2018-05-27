package voblaweb.photo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import voblaweb.photo.model.Lovers;

public interface LoversRepository extends JpaRepository<Lovers,Integer> {
}
