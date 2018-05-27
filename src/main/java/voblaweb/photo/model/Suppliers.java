package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
@EntityListeners(AuditingEntityListener.class)
public class Suppliers {

    @Id
    @Column(name = "suppliers_id")
    private int supplierId;
    private String supplierName;

    public Suppliers(String supplierName) {
        this.supplierName = supplierName;
    }

    public Suppliers() {
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
