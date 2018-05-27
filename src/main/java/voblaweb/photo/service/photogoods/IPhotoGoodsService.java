package voblaweb.photo.service.photogoods;

import voblaweb.photo.model.PhotoGoods;

import java.util.List;

public interface IPhotoGoodsService {
    List<PhotoGoods> getAll();
    PhotoGoods insert(PhotoGoods photoGoods);
    PhotoGoods update(PhotoGoods photoGoods);
    void deleteById(int id);
}
