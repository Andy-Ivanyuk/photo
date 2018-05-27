package voblaweb.photo.controller;

import voblaweb.photo.model.Supplies;
import voblaweb.photo.service.supplies.ISuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplies")
public class SuppliesController {
    @Autowired
    ISuppliesService suppliesService;

    @RequestMapping("/get")
    public List<Supplies> getSupplies(){
        return suppliesService.getAll();
    }

    @PostMapping("/insert")
    public Supplies insertCall(@RequestBody Supplies supplies) {
        return suppliesService.insert(supplies);
    }

    @RequestMapping("/update")
    public Supplies updateCall(@RequestBody Supplies supplies, @RequestParam("id") int id) {
        supplies.setSuppliesId(id);
        return suppliesService.update(supplies);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        suppliesService.deleteById((int)id);
    }
}
