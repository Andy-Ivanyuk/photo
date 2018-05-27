package voblaweb.photo.service.suppliers;

import voblaweb.photo.model.Suppliers;
import voblaweb.photo.repository.SuppliersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuppliersService implements ISuppliersService {

    @Autowired
    SuppliersRepository repository;

    @Override
    public List<Suppliers> getAll() {
        return repository.findAll();
    }

    @Override
    public Suppliers insert(Suppliers suppliers) {
        return repository.save(suppliers);
    }

    @Override
    public Suppliers update(Suppliers suppliers) {
        return repository.save(suppliers);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
