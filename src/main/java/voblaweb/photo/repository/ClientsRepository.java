package voblaweb.photo.repository;

import org.springframework.data.repository.CrudRepository;
import voblaweb.photo.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends CrudRepository<Clients,Integer> {
}
