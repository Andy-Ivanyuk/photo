package voblaweb.photo.service.kiosks;

import voblaweb.photo.model.Kiosks;

import java.util.List;

public interface IKiosksService {
    List<Kiosks> getAll();
    Kiosks insert(Kiosks kiosks);
    Kiosks update(Kiosks kiosks);
    void deleteById(int id);
}
