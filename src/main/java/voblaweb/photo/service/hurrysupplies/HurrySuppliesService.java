package voblaweb.photo.service.hurrysupplies;

import voblaweb.photo.model.HurrySupplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voblaweb.photo.repository.HurrySuppliesRepository;
import voblaweb.photo.service.hurrysupplies.IHurrySuppliesService;

import java.util.List;

@Service
public class HurrySuppliesService implements IHurrySuppliesService {

    @Autowired
    HurrySuppliesRepository repository;

    @Override
    public List<HurrySupplies> getAll() {
        return (List<HurrySupplies>)repository.findAll();
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
    public HurrySupplies getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
