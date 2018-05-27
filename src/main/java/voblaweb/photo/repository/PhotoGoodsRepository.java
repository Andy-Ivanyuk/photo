package voblaweb.photo.repository;

import voblaweb.photo.model.PhotoGoods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoGoodsRepository extends JpaRepository<PhotoGoods,Integer> {
}
