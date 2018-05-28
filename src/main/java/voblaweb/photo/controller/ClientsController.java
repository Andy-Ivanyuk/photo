package voblaweb.photo.controller;

import voblaweb.photo.model.Branches;
import voblaweb.photo.model.Clients;
import voblaweb.photo.service.clients.ClientsService;
import voblaweb.photo.service.clients.IClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voblaweb.photo.service.clients.IClientsService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientsController {
    @Autowired
    ClientsService clientsService;

    @RequestMapping("/clients")
    public List<Clients> getClients(){
        return clientsService.getAll();
    }

    @RequestMapping("/clients/get")
    public Clients getById(@RequestParam int id){
        return clientsService.getById(id);
    }

    @RequestMapping("/clients/insert")
    public Clients insertCall(@RequestParam String name, Boolean discountCard, int branchesBranchId) {
        Branches branches = new Branches(null, 0);
        branches.setBranchId(branchesBranchId);
        Clients client = new Clients(name, discountCard, branches);
        return clientsService.insert(client);
    }

    @RequestMapping("/clients/update")
    public Clients updateCall(@RequestParam int id, String name, Boolean discountCard, int branchesBranchId) {
        Branches branches = new Branches(null, 0);
        branches.setBranchId(branchesBranchId);
        Clients client = new Clients(name, discountCard, branches);
        client.setClientId(id);
        return clientsService.update(client);
    }

    @RequestMapping("/clients/del")
    public void delCall(@RequestParam int id){
        clientsService.deleteById(id);
    }
}
