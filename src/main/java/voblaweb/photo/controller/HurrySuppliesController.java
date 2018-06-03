package voblaweb.photo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voblaweb.photo.model.Branches;
import voblaweb.photo.model.Clients;
import voblaweb.photo.model.HurrySupplies;
import voblaweb.photo.model.TypeOfSupplies;
import voblaweb.photo.service.hurrysupplies.HurrySuppliesService;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HurrySuppliesController {
    @Autowired
    HurrySuppliesService service;

    @RequestMapping("/hurry_supplies")
    public List<HurrySupplies> getAll(){
        return service.getAll();
    }

    @RequestMapping("/hurry_supplies/get")
    public HurrySupplies getById(@RequestParam int id){
        return service.getById(id);
    }

    @RequestMapping("/hurry_supplies/insert")
    public HurrySupplies insert(@RequestParam int branchId, int typeOfSupplyId, int price,
                           int amountOfPhotosPerFrame, int totalAmountOfPhotos, String format,
                           String paperType, Date supplyDate, String done, int clientId) {
        Branches branches = new Branches();
        branches.setId(branchId);
        TypeOfSupplies typeOfSupplies = new TypeOfSupplies();
        typeOfSupplies.setId(typeOfSupplyId);
        Clients clients = new Clients();
        clients.setId(clientId);
        HurrySupplies supplies = new HurrySupplies(branches, typeOfSupplies, price, amountOfPhotosPerFrame,
                totalAmountOfPhotos, format, paperType, supplyDate, done, clients);
        return service.insert(supplies);
    }

    @RequestMapping("/hurry_supplies/update")
    public HurrySupplies updateCall(@RequestParam int id, int branchId, int typeOfSupplyId, int price,
                               int amountOfPhotosPerFrame, int totalAmountOfPhotos, String format,
                               String paperType, Date supplyDate, String done, int clientId) {
        Branches branches = new Branches();
        branches.setId(branchId);
        TypeOfSupplies typeOfSupplies = new TypeOfSupplies();
        typeOfSupplies.setId(typeOfSupplyId);
        Clients clients = new Clients();
        clients.setId(clientId);
        HurrySupplies supplies = new HurrySupplies(branches, typeOfSupplies, price, amountOfPhotosPerFrame,
                totalAmountOfPhotos, format, paperType, supplyDate, done, clients);
        supplies.setId(id);
        return service.update(supplies);
    }

    @RequestMapping("/hurry_supplies/del")
    public void delete(@RequestParam int id){
        service.delete(id);
    }
}
