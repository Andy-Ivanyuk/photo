package voblaweb.photo.service.officeorders;

import voblaweb.photo.model.OfficeOrders;

import java.util.List;

public interface IOfficeOrdersService {
    List<OfficeOrders> getAll();
    OfficeOrders insert(OfficeOrders officeOrders);
    OfficeOrders update(OfficeOrders officeOrders);
    OfficeOrders getById(int id);
    void delete(int id);
}
