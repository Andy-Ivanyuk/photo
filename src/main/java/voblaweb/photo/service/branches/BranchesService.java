package voblaweb.photo.service.branches;

import voblaweb.photo.model.Branches;
import voblaweb.photo.repository.BranchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchesService implements IBranchesService {

    @Autowired
    BranchesRepository repository;

    @Override
    public List<Branches> getAll() {
        return repository.findAll();
    }

    @Override
    public Branches insert(Branches branches) {
        return repository.save(branches);
    }

    @Override
    public Branches update(Branches branches) {
        return repository.save(branches);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
