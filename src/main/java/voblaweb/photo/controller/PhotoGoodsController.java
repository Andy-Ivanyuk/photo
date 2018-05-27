package voblaweb.photo.controller;

import voblaweb.photo.model.PhotoGoods;
import voblaweb.photo.service.photogoods.IPhotoGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voblaweb.photo.model.PhotoGoods;
import voblaweb.photo.service.photogoods.IPhotoGoodsService;

import java.util.List;

@RestController
@RequestMapping("/photo_goods")
public class PhotoGoodsController {
    @Autowired
    IPhotoGoodsService photoGoodsService;

    @RequestMapping("/get")
    public List<PhotoGoods> getPhotoGoods(){
        return photoGoodsService.getAll();
    }

    @PostMapping("/insert")
    public PhotoGoods insertCall(@RequestBody PhotoGoods photoGoods) {
        return photoGoodsService.insert(photoGoods);
    }

    @RequestMapping("/update")
    public PhotoGoods updateCall(@RequestBody PhotoGoods photoGoods,@RequestParam("id") int id) {
        photoGoods.setGoodId(id);
        return photoGoodsService.update(photoGoods);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        photoGoodsService.deleteById((int)id);
    }
}
