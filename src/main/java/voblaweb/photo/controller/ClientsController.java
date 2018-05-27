package voblaweb.photo.controller;

import voblaweb.photo.model.Clients;
import voblaweb.photo.service.clients.IClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voblaweb.photo.service.clients.IClientsService;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientsController {
    @Autowired
    IClientsService clientsService;

    @RequestMapping("/get")
    public List<Clients> getClients(){
        return clientsService.getAll();
    }

    @PostMapping("/insert")
    public Clients insertCall(@RequestBody Clients clients) {
        return clientsService.insert(clients);
    }

    @RequestMapping("/update")
    public Clients updateCall(@RequestBody Clients clients,@RequestParam("id") int id) {
        clients.setClientId(id);
        return clientsService.update(clients);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        clientsService.deleteById((int)id);
    }
}
