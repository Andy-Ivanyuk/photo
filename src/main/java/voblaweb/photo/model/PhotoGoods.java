package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "good")
@EntityListeners(AuditingEntityListener.class)
public class PhotoGoods {
    @Id
    @Column(name = "good_id")
    private int goodId;
    private String goodName;
    @ManyToOne
    private GoodType goodTypeGoodTypeId;
    @ManyToOne
    private Suppliers suppliersSupplierId;

    public PhotoGoods(String goodName, GoodType goodTypeGoodTypeId, Suppliers suppliersSupplierId) {
        this.goodName = goodName;
        this.goodTypeGoodTypeId = goodTypeGoodTypeId;
        this.suppliersSupplierId = suppliersSupplierId;
    }

    public PhotoGoods() {
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public GoodType getGoodTypeGoodTypeId() {
        return goodTypeGoodTypeId;
    }

    public void setGoodTypeGoodTypeId(GoodType goodTypeGoodTypeId) {
        this.goodTypeGoodTypeId = goodTypeGoodTypeId;
    }

    public Suppliers getSuppliersSupplierId() {
        return suppliersSupplierId;
    }

    public void setSuppliersSupplierId(Suppliers suppliersSupplierId) {
        this.suppliersSupplierId = suppliersSupplierId;
    }
}
