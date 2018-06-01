//package voblaweb.photo.controller;
//
//import com.sun.security.ntlm.Client;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import voblaweb.photo.model.Branches;
//import voblaweb.photo.model.Clients;
//import voblaweb.photo.model.HurrySupplies;
//import voblaweb.photo.model.TypeOfSupplies;
//import voblaweb.photo.service.hurrysupplies.HurrySuppliesService;
//
//import java.sql.Date;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class HurrySuppliesController {
//    @Autowired
//    HurrySuppliesService service;
//
//    @RequestMapping("/hurry_supplies")
//    public List<HurrySupplies> getAll(){
//        return service.getAll();
//    }
//
//    @RequestMapping("/hurry_supplies/get")
//    public HurrySupplies getById(@RequestParam int id){
//        return service.getById(id);
//    }
//
//    @RequestMapping("/hurry_supplies/insert")
//    public HurrySupplies insert(@RequestParam int amountOfPhotosPerFrame, String format, int isDone,
//                                String paperType, int price, Date supplyDate, int totalAmountOfPhotos,
//                                int branchId, int clientId, int typeOfSuppliesId) {
//        Branches branches = new Branches();
//        branches.setId(branchId);
//        Clients clients = new Clients();
//        clients.setId(clientId);
//        TypeOfSupplies typeOfSupplies = new TypeOfSupplies();
//        typeOfSupplies.setId(typeOfSuppliesId);
//        HurrySupplies hurrySupplies = new HurrySupplies(amountOfPhotosPerFrame, format, isDone, paperType, price,
//                supplyDate, totalAmountOfPhotos, branchId, clientId, typeOfSuppliesId);
//        return service.insert(hurrySupplies);
//    }
//
//    @RequestMapping("/hurry_supplies/update")
//    public HurrySupplies updateCall(@RequestParam int id, int amountOfPhotosPerFrame, String format,
//                                    int isDone, String paperType, int price, Date supplyDate,
//                                    int totalAmountOfPhotos, int branchId, int clientId,
//                                    int typeOfSuppliesId) {
//        Branches branches = new Branches();
//        branches.setId(branchId);
//        Clients clients = new Clients();
//        clients.setId(clientId);
//        TypeOfSupplies typeOfSupplies = new TypeOfSupplies();
//        typeOfSupplies.setId(typeOfSuppliesId);
//        HurrySupplies hurrySupplies = new HurrySupplies(amountOfPhotosPerFrame, format, isDone, paperType, price,
//                supplyDate, totalAmountOfPhotos, branchId, clientId, typeOfSuppliesId);
//        hurrySupplies.setId(id);
//        return service.update(hurrySupplies);
//    }
//
//    @RequestMapping("/hurry_supplies/del")
//    public void delete(@RequestParam int id){
//        service.delete(id);
//    }
//}
