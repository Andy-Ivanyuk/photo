package voblaweb.photo.controller;

import voblaweb.photo.model.HurrySupplies;
import voblaweb.photo.service.hurrysupplies.IHurrySuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voblaweb.photo.model.HurrySupplies;
import voblaweb.photo.service.hurrysupplies.IHurrySuppliesService;

import java.util.List;

@RestController
@RequestMapping("/hurry_supplies")
public class HurrySuppliesController {
    @Autowired
    IHurrySuppliesService hurrySuppliesService;

    @RequestMapping("/get")
    public List<HurrySupplies> getHurrySupplies(){
        return hurrySuppliesService.getAll();
    }

    @PostMapping("/insert")
    public HurrySupplies insertCall(@RequestBody HurrySupplies hurrySupplies) {
        return hurrySuppliesService.insert(hurrySupplies);
    }

    @RequestMapping("/update")
    public HurrySupplies updateCall(@RequestBody HurrySupplies hurrySupplies, @RequestParam("id") int id) {
        hurrySupplies.setHurrySuppliesId(id);
        return hurrySuppliesService.update(hurrySupplies);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        hurrySuppliesService.deleteById((int)id);
    }
}
