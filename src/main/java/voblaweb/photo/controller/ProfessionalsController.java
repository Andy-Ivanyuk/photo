package voblaweb.photo.controller;

import voblaweb.photo.model.Professionals;
import voblaweb.photo.service.professionals.IProfessionalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professionals")
public class ProfessionalsController {
    @Autowired
    IProfessionalsService professionalsService;

    @RequestMapping("/get")
    public List<Professionals> getProfessionals(){
        return professionalsService.getAll();
    }

    @PostMapping("/insert")
    public Professionals insertCall(@RequestBody Professionals professionals) {
        return professionalsService.insert(professionals);
    }

    @RequestMapping("/update")
    public Professionals updateCall(@RequestBody Professionals professionals,@RequestParam("id") int id) {
        professionals.setProfessionalId(id);
        return professionalsService.update(professionals);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        professionalsService.deleteById((int)id);
    }
}
