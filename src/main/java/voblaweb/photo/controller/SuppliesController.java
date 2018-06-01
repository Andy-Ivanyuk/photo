package voblaweb.photo.controller;

import voblaweb.photo.model.Clients;
import voblaweb.photo.model.Kiosks;
import voblaweb.photo.model.Supplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voblaweb.photo.model.TypeOfSupplies;
import voblaweb.photo.service.supplies.SuppliesService;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SuppliesController {
    @Autowired
    SuppliesService service;

    @RequestMapping("/supplies")
    public List<Supplies> getAll(){
        return service.getAll();
    }

    @RequestMapping("/supplies/get")
    public Supplies getById(@RequestParam int id){
        return service.getById(id);
    }

    @RequestMapping("/supplies/insert")
    public Supplies insert(@RequestParam int kioskId, int typeOfSupplyId, int price,
                           int amountOfPhotosPerFrame, int totalAmountOfPhotos, String format,
                           String paperType, Date supplyDate, Boolean isDone, int clientId) {
        Kiosks kiosks = new Kiosks();
        kiosks.setId(kioskId);
        TypeOfSupplies typeOfSupplies = new TypeOfSupplies();
        typeOfSupplies.setId(typeOfSupplyId);
        Clients clients = new Clients();
        clients.setId(clientId);
        Supplies supplies = new Supplies(kiosks, typeOfSupplies, price, amountOfPhotosPerFrame,
                totalAmountOfPhotos, format, paperType, supplyDate, isDone, clients);
        return service.insert(supplies);
    }

    @RequestMapping("/supplies/update")
    public Supplies updateCall(@RequestParam int id, int kioskId, int typeOfSupplyId, int price,
                                     int amountOfPhotosPerFrame, int totalAmountOfPhotos, String format,
                                     String paperType, Date supplyDate, Boolean isDone, int clientId) {
        Kiosks kiosks = new Kiosks();
        kiosks.setId(kioskId);
        TypeOfSupplies typeOfSupplies = new TypeOfSupplies();
        typeOfSupplies.setId(typeOfSupplyId);
        Clients clients = new Clients();
        clients.setId(clientId);
        Supplies supplies = new Supplies(kiosks, typeOfSupplies, price, amountOfPhotosPerFrame,
                totalAmountOfPhotos, format, paperType, supplyDate, isDone, clients);
        supplies.setId(id);
        return service.update(supplies);
    }

    @RequestMapping("/supplies/del")
    public void delete(@RequestParam int id){
        service.delete(id);
    }
}
