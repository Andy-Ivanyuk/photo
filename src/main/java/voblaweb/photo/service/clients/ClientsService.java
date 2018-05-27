package voblaweb.photo.service.clients;

import voblaweb.photo.model.Clients;
import voblaweb.photo.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService implements IClientsService {

    @Autowired
    ClientsRepository repository;

    @Override
    public List<Clients> getAll() {
        return repository.findAll();
    }

    @Override
    public Clients insert(Clients clients) {
        return repository.save(clients);
    }

    @Override
    public Clients update(Clients clients) {
        return repository.save(clients);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
