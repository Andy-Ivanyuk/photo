package voblaweb.photo.controller;

import voblaweb.photo.model.Branches;
import voblaweb.photo.service.branches.BranchesService;
import voblaweb.photo.service.branches.IBranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voblaweb.photo.model.Branches;
import voblaweb.photo.service.branches.IBranchesService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BranchesController {
    @Autowired
    BranchesService branchesService;

    @RequestMapping("/branches")
    public List<Branches> getBranches(){
        return branchesService.getAll();
    }

    @RequestMapping("/branches/get")
    public Branches getById(@RequestParam int id){
        return branchesService.getById(id);
    }

    @RequestMapping("/branches/insert")
    public Branches insertCall(@RequestParam String branchAddress, int branchAmountOfWorkplaces) {
        Branches branches = new Branches(branchAddress, branchAmountOfWorkplaces);
        return branchesService.insert(branches);
    }

    @RequestMapping("/branches/update")
    public Branches updateCall(@RequestParam int id, String branchAddress, int branchAmountOfWorkplaces) {
        Branches branches = new Branches(branchAddress, branchAmountOfWorkplaces);
        branches.setBranchId(id);
        System.out.println("In insertCall");
        return branchesService.update(branches);
    }

    @RequestMapping("/branches/del")
    public void delCall(@RequestParam int id){
        branchesService.deleteById(id);
    }
}
