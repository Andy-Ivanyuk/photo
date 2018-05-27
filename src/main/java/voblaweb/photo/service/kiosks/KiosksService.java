package voblaweb.photo.service.kiosks;

import voblaweb.photo.model.Kiosks;
import voblaweb.photo.repository.KiosksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KiosksService implements IKiosksService {

    @Autowired
    KiosksRepository repository;

    @Override
    public List<Kiosks> getAll() {
        return repository.findAll();
    }

    @Override
    public Kiosks insert(Kiosks kiosks) {
        return repository.save(kiosks);
    }

    @Override
    public Kiosks update(Kiosks kiosks) {
        return repository.save(kiosks);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
