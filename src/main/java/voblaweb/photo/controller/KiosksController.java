package voblaweb.photo.controller;

import voblaweb.photo.model.Kiosks;
import voblaweb.photo.service.kiosks.IKiosksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kiosks")
public class KiosksController {
    @Autowired
    IKiosksService kiosksService;

    @RequestMapping("/get")
    public List<Kiosks> getKiosks(){
        return kiosksService.getAll();
    }

    @PostMapping("/insert")
    public Kiosks insertCall(@RequestBody Kiosks kiosks) {
        return kiosksService.insert(kiosks);
    }

    @RequestMapping("/update")
    public Kiosks updateCall(@RequestBody Kiosks kiosks, @RequestParam("id") int id) {
        kiosks.setKioskId(id);
        return kiosksService.update(kiosks);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        kiosksService.deleteById((int)id);
    }
}
