package voblaweb.photo.service.suppliers;

import voblaweb.photo.model.Suppliers;

import java.util.List;

public interface ISuppliersService {
    List<Suppliers> getAll();
    Suppliers insert(Suppliers suppliers);
    Suppliers update(Suppliers suppliers);
    void deleteById(int id);
}
