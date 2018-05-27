package voblaweb.photo.service.supplies;

import voblaweb.photo.model.Supplies;

import java.util.List;

public interface ISuppliesService {
    List<Supplies> getAll();
    Supplies insert(Supplies supplies);
    Supplies update(Supplies supplies);
    void deleteById(int id);
}
