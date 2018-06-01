package voblaweb.photo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import voblaweb.photo.model.Branches;

@Repository
public interface BranchesRepository extends CrudRepository<Branches,Integer> {
}
