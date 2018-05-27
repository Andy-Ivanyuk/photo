package voblaweb.photo.repository;

import voblaweb.photo.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients,Integer> {
}
