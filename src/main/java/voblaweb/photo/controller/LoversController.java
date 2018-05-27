package voblaweb.photo.controller;

import voblaweb.photo.model.Lovers;
import voblaweb.photo.service.lovers.ILoversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voblaweb.photo.model.Lovers;
import voblaweb.photo.service.lovers.ILoversService;

import java.util.List;

@RestController
@RequestMapping("/lovers")
public class LoversController {
    @Autowired
    ILoversService loversService;

    @RequestMapping("/get")
    public List<Lovers> getLovers(){
        return loversService.getAll();
    }

    @PostMapping("/insert")
    public Lovers insertCall(@RequestBody Lovers lovers) {
        return loversService.insert(lovers);
    }

    @RequestMapping("/update")
    public Lovers updateCall(@RequestBody Lovers lovers, @RequestParam("id") int id) {
        lovers.setLoverId(id);
        return loversService.update(lovers);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        loversService.deleteById((int)id);
    }
}
