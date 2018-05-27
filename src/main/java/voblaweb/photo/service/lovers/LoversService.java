package voblaweb.photo.service.lovers;

import voblaweb.photo.model.Lovers;
import voblaweb.photo.repository.LoversRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoversService implements ILoversService {

    @Autowired
    LoversRepository repository;

    @Override
    public List<Lovers> getAll() {
        return repository.findAll();
    }

    @Override
    public Lovers insert(Lovers lovers) {
        return repository.save(lovers);
    }

    @Override
    public Lovers update(Lovers lovers) {
        return repository.save(lovers);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
