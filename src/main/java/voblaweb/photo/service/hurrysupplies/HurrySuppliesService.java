package voblaweb.photo.service.hurrysupplies;

import voblaweb.photo.model.HurrySupplies;
import voblaweb.photo.repository.HurrySuppliesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HurrySuppliesService implements IHurrySuppliesService {

    @Autowired
    HurrySuppliesRepository repository;

    @Override
    public List<HurrySupplies> getAll() {
        return repository.findAll();
    }

    @Override
    public HurrySupplies insert(HurrySupplies hurrySupplies) {
        return repository.save(hurrySupplies);
    }

    @Override
    public HurrySupplies update(HurrySupplies hurrySupplies) {
        return repository.save(hurrySupplies);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
