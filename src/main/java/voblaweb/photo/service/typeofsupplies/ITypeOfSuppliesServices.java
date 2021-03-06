package voblaweb.photo.service.typeofsupplies;

import voblaweb.photo.model.TypeOfSupplies;

import java.util.List;

public interface ITypeOfSuppliesServices {
    List<TypeOfSupplies> getAll();
    TypeOfSupplies insert(TypeOfSupplies typeOfSupplies);
    TypeOfSupplies update(TypeOfSupplies typeOfSupplies);
    void deleteById(int id);
}
