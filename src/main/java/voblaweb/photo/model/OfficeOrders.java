package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "office_orders")
@EntityListeners(AuditingEntityListener.class)
public class OfficeOrders {

    @Id
    @Column(name = "office_orders_id")
    private int officeOrdersId;
    @ManyToOne
    private PhotoGoods photoGoodsPhotoGoodsId;
    @ManyToOne
    private Kiosks kiosksKioskId;
    private Date dateOfSupply;
    private int amountOfGoods;
    private int price;
    private Date dateOfSelling;

    public OfficeOrders(PhotoGoods photoGoodsPhotoGoodsId, Kiosks kiosksKioskId, Date dateOfSupply,
                        int amountOfGoods, int price, Date dateOfSelling) {
        this.photoGoodsPhotoGoodsId = photoGoodsPhotoGoodsId;
        this.kiosksKioskId = kiosksKioskId;
        this.dateOfSupply = dateOfSupply;
        this.amountOfGoods = amountOfGoods;
        this.price = price;
        this.dateOfSelling = dateOfSelling;
    }

    public OfficeOrders() {
    }

    public int getOfficeOrdersId() {
        return officeOrdersId;
    }

    public void setOfficeOrdersId(int officeOrdersId) {
        this.officeOrdersId = officeOrdersId;
    }

    public PhotoGoods getPhotoGoodsPhotoGoodsId() {
        return photoGoodsPhotoGoodsId;
    }

    public void setPhotoGoodsPhotoGoodsId(PhotoGoods photoGoodsPhotoGoodsId) {
        this.photoGoodsPhotoGoodsId = photoGoodsPhotoGoodsId;
    }

    public Kiosks getKiosksKioskId() {
        return kiosksKioskId;
    }

    public void setKiosksKioskId(Kiosks kiosksKioskId) {
        this.kiosksKioskId = kiosksKioskId;
    }

    public Date getDateOfSupply() {
        return dateOfSupply;
    }

    public void setDateOfSupply(Date dateOfSupply) {
        this.dateOfSupply = dateOfSupply;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    public void setAmountOfGoods(int amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateOfSelling() {
        return dateOfSelling;
    }

    public void setDateOfSelling(Date dateOfSelling) {
        this.dateOfSelling = dateOfSelling;
    }
}
