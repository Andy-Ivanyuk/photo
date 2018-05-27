package voblaweb.photo.service.professionals;

import voblaweb.photo.model.Professionals;
import voblaweb.photo.repository.ProfessionalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalsService implements IProfessionalsService {

    @Autowired
    ProfessionalsRepository repository;

    @Override
    public List<Professionals> getAll() {
        return repository.findAll();
    }

    @Override
    public Professionals insert(Professionals professionals) {
        return repository.save(professionals);
    }

    @Override
    public Professionals update(Professionals professionals) {
        return repository.save(professionals);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
