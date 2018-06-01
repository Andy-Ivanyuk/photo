package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "photo_goods")
@EntityListeners(AuditingEntityListener.class)
public class PhotoGoods {
    @Id
    @Column(name = "good_id")
    private int goodId;
    private String goodName;
    @ManyToOne
    private GoodType goodTypeGoodTypeId;
    private String suppliersName;

    public PhotoGoods(String goodName, GoodType goodTypeGoodTypeId, String suppliersName) {
        this.goodName = goodName;
        this.goodTypeGoodTypeId = goodTypeGoodTypeId;
        this.suppliersName = suppliersName;
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

    public String getSuppliersName() {
        return suppliersName;
    }

    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName;
    }
}
