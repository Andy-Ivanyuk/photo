package voblaweb.photo.service.professionals;

import voblaweb.photo.model.Professionals;

import java.util.List;

public interface IProfessionalsService {
    List<Professionals> getAll();
    Professionals insert(Professionals professionals);
    Professionals update(Professionals professionals);
    void deleteById(int id);
}
