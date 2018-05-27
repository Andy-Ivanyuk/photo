package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "good_type")
@EntityListeners(AuditingEntityListener.class)
public class GoodType {
    @Id
    @Column(name = "good_type_id")
    private int goodTypeId;
    private String goodTypeName;

    public GoodType(String goodTypeName) {
        this.goodTypeName = goodTypeName;
    }

    public GoodType() {
    }

    public int getGoodTypeId() {
        return goodTypeId;
    }

    public void setGoodTypeId(int goodTypeId) {
        this.goodTypeId = goodTypeId;
    }

    public String getGoodTypeName() {
        return goodTypeName;
    }

    public void setGoodTypeName(String goodTypeName) {
        this.goodTypeName = goodTypeName;
    }
}
