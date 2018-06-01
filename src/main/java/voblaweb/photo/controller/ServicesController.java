//package voblaweb.photo.controller;
//
//import voblaweb.photo.model.Services;
//import voblaweb.photo.service.services.IServicesService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/services")
//public class ServicesController {
//    @Autowired
//    IServicesService servicesService;
//
//    @RequestMapping("/get")
//    public List<Services> getServices(){
//        return servicesService.getAll();
//    }
//
//    @PostMapping("/insert")
//    public Services insertCall(@RequestBody Services services) {
//        return servicesService.insert(services);
//    }
//
//    @RequestMapping("/update")
//    public Services updateCall(@RequestBody Services services,@RequestParam("id") int id) {
//        services.setServiceId(id);
//        return servicesService.update(services);
//    }
//
//    @RequestMapping("/del")
//    public void delCall(@RequestParam("id") int id){
//        servicesService.deleteById((int)id);
//    }
//}
