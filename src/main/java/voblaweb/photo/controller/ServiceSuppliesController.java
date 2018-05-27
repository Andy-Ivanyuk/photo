package voblaweb.photo.controller;

import voblaweb.photo.model.ServiceSupplies;
import voblaweb.photo.service.servicesupplies.IServiceSuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service_supplies")
public class ServiceSuppliesController {
    @Autowired
    IServiceSuppliesService serviceSuppliesService;

    @RequestMapping("/get")
    public List<ServiceSupplies> getServiceSupplies(){
        return serviceSuppliesService.getAll();
    }

    @PostMapping("/insert")
    public ServiceSupplies insertCall(@RequestBody ServiceSupplies serviceSupplies) {
        return serviceSuppliesService.insert(serviceSupplies);
    }

    @RequestMapping("/update")
    public ServiceSupplies updateCall(@RequestBody ServiceSupplies serviceSupplies, @RequestParam("id") int id) {
        serviceSupplies.setServiceSuppliesId(id);
        return serviceSuppliesService.update(serviceSupplies);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        serviceSuppliesService.deleteById((int)id);
    }
}
