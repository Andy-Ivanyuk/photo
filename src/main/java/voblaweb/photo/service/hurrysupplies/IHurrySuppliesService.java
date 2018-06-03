package voblaweb.photo.service.hurrysupplies;

import voblaweb.photo.model.HurrySupplies;

import java.util.List;

public interface IHurrySuppliesService {
    List<HurrySupplies> getAll();
    HurrySupplies insert(HurrySupplies hurrySupplies);
    HurrySupplies update(HurrySupplies hurrySupplies);
    HurrySupplies getById(int id);
    void delete(int id);
}
