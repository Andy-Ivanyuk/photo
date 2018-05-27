package voblaweb.photo.controller;

import voblaweb.photo.model.GoodType;
import voblaweb.photo.service.goodtype.IGoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/good_type")
public class GoodTypeController {
    @Autowired
    IGoodTypeService goodTypeService;

    @RequestMapping("/get")
    public List<GoodType> getGoodType(){
        return goodTypeService.getAll();
    }

    @PostMapping("/insert")
    public GoodType insertCall(@RequestBody GoodType goodType) {
        return goodTypeService.insert(goodType);
    }

    @RequestMapping("/update")
    public GoodType updateCall(@RequestBody GoodType goodType, @RequestParam("id") int id) {
        goodType.setGoodTypeId(id);
        return goodTypeService.update(goodType);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        goodTypeService.deleteById((int)id);
    }
}
