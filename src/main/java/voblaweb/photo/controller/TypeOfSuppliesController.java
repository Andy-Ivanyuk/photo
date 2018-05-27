package voblaweb.photo.controller;

import voblaweb.photo.model.TypeOfSupplies;
import voblaweb.photo.service.typeofsupplies.ITypeOfSuppliesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voblaweb.photo.model.TypeOfSupplies;

import java.util.List;

@RestController
@RequestMapping("/type_of_supplies")
public class TypeOfSuppliesController {
    @Autowired
    ITypeOfSuppliesServices typeOfSuppliesService;

    @RequestMapping("/get")
    public List<TypeOfSupplies> getTypeOfSupplies(){
        return typeOfSuppliesService.getAll();
    }

    @PostMapping("/insert")
    public TypeOfSupplies insertCall(@RequestBody TypeOfSupplies typeOfSupplies) {
        return typeOfSuppliesService.insert(typeOfSupplies);
    }

    @RequestMapping("/update")
    public TypeOfSupplies updateCall(@RequestBody TypeOfSupplies typeOfSupplies,@RequestParam("id") int id) {
        typeOfSupplies.setTypeId(id);
        return typeOfSuppliesService.update(typeOfSupplies);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        typeOfSuppliesService.deleteById((int)id);
    }
}
