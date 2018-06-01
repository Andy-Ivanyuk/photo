package voblaweb.photo.service.supplies;

import voblaweb.photo.model.Supplies;
import voblaweb.photo.repository.SuppliesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuppliesService implements ISuppliesService {

    @Autowired
    SuppliesRepository repository;

    @Override
    public List<Supplies> getAll() {
        return (List<Supplies>)repository.findAll();
    }

    @Override
    public Supplies insert(Supplies supplies) {
        return repository.save(supplies);
    }

    @Override
    public Supplies update(Supplies supplies) {
        return repository.save(supplies);
    }

    @Override
    public Supplies getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
