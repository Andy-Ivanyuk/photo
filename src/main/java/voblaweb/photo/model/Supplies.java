package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "supplies")
@EntityListeners(AuditingEntityListener.class)
public class Supplies {

    @Id
    @Column(name = "supplies_id")
    private int suppliesId;
    @ManyToOne
    private Kiosks kiosksKioskId;
    @ManyToOne
    private TypeOfSupplies typeOfSuppliesTypeId;
    private int price;
    private int amountOfPhotosPerFrame;
    private int totalAmountOfPhotos;
    private String format;
    private String paperType;
    private Date supplyDate;
    private Boolean isDone;
    @ManyToOne
    private Clients clientsClientId;

    public Supplies(Kiosks kiosksKioskId, TypeOfSupplies typeOfSuppliesTypeId, int price,
                    int amountOfPhotosPerFrame, int totalAmountOfPhotos, String format,
                    String paperType, Date supplyDate, Boolean isDone, Clients clientsClientId) {
        this.kiosksKioskId = kiosksKioskId;
        this.typeOfSuppliesTypeId = typeOfSuppliesTypeId;
        this.price = price;
        this.amountOfPhotosPerFrame = amountOfPhotosPerFrame;
        this.totalAmountOfPhotos = totalAmountOfPhotos;
        this.format = format;
        this.paperType = paperType;
        this.supplyDate = supplyDate;
        this.isDone = isDone;
        this.clientsClientId = clientsClientId;
    }

    public Supplies() {
    }

    public int getSuppliesId() {
        return suppliesId;
    }

    public void setSuppliesId(int suppliesId) {
        this.suppliesId = suppliesId;
    }

    public Kiosks getKiosksKioskId() {
        return kiosksKioskId;
    }

    public void setKiosksKioskId(Kiosks kiosksKioskId) {
        this.kiosksKioskId = kiosksKioskId;
    }

    public TypeOfSupplies getTypeOfSuppliesTypeId() {
        return typeOfSuppliesTypeId;
    }

    public void setTypeOfSuppliesTypeId(TypeOfSupplies typeOfSuppliesTypeId) {
        this.typeOfSuppliesTypeId = typeOfSuppliesTypeId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountOfPhotosPerFrame() {
        return amountOfPhotosPerFrame;
    }

    public void setAmountOfPhotosPerFrame(int amountOfPhotosPerFrame) {
        this.amountOfPhotosPerFrame = amountOfPhotosPerFrame;
    }

    public int getTotalAmountOfPhotos() {
        return totalAmountOfPhotos;
    }

    public void setTotalAmountOfPhotos(int totalAmountOfPhotos) {
        this.totalAmountOfPhotos = totalAmountOfPhotos;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public Date getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(Date supplyDate) {
        this.supplyDate = supplyDate;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Clients getClientsClientId() {
        return clientsClientId;
    }

    public void setClientsClientId(Clients clientsClientId) {
        this.clientsClientId = clientsClientId;
    }
}
