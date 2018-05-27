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
        return repository.findAll();
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
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
