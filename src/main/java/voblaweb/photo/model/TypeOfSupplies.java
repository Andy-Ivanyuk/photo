package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "type_of_supplies")
@EntityListeners(AuditingEntityListener.class)
public class TypeOfSupplies {

    @Id
    @Column(name = "type_of_supplies_id")
    private int typeId;
    private String nameOfSupply;

    public TypeOfSupplies(String nameOfSupply) {
        this.nameOfSupply = nameOfSupply;
    }

    public TypeOfSupplies() {
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getNameOfSupply() {
        return nameOfSupply;
    }

    public void setNameOfSupply(String nameOfSupply) {
        this.nameOfSupply = nameOfSupply;
    }
}
