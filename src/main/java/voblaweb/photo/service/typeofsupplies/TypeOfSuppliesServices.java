package voblaweb.photo.service.typeofsupplies;

import voblaweb.photo.model.TypeOfSupplies;
import voblaweb.photo.repository.TypeOfSuppliesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfSuppliesServices implements ITypeOfSuppliesServices {

    @Autowired
    TypeOfSuppliesRepository repository;

    @Override
    public List<TypeOfSupplies> getAll() {
        return repository.findAll();
    }

    @Override
    public TypeOfSupplies insert(TypeOfSupplies typeOfSupplies) {
        return repository.save(typeOfSupplies);
    }

    @Override
    public TypeOfSupplies update(TypeOfSupplies typeOfSupplies) {
        return repository.save(typeOfSupplies);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
