package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hurry_supplies")
@EntityListeners(AuditingEntityListener.class)
public class HurrySupplies {

    @Id
    @Column(name = "hurry_supplies_id")
    private int hurrySuppliesId;
    @ManyToOne
    private TypeOfSupplies typeOfSuppliesTypeId;
    @ManyToOne
    private Branches branchesBranchId;
    private int price;
    private int amountOfPhotosPerFrame;
    private int totalAmountOfPhotos;
    private String format;
    private String paperType;
    private Date supplyDate;
    private Boolean isDone;
    @ManyToOne
    private Clients clientsClientId;

    public HurrySupplies(TypeOfSupplies typeOfSuppliesTypeId, Branches branchesBranchId, int price,
                         int amountOfPhotosPerFrame, int totalAmountOfPhotos, String format,
                         String paperType, Date supplyDate, Boolean isDone, Clients clientsClientId) {
        this.typeOfSuppliesTypeId = typeOfSuppliesTypeId;
        this.branchesBranchId = branchesBranchId;
        this.price = price;
        this.amountOfPhotosPerFrame = amountOfPhotosPerFrame;
        this.totalAmountOfPhotos = totalAmountOfPhotos;
        this.format = format;
        this.paperType = paperType;
        this.supplyDate = supplyDate;
        this.isDone = isDone;
        this.clientsClientId = clientsClientId;
    }

    public HurrySupplies() {
    }

    public int getHurrySuppliesId() {
        return hurrySuppliesId;
    }

    public void setHurrySuppliesId(int hurrySuppliesId) {
        this.hurrySuppliesId = hurrySuppliesId;
    }

    public TypeOfSupplies getTypeOfSuppliesTypeId() {
        return typeOfSuppliesTypeId;
    }

    public void setTypeOfSuppliesTypeId(TypeOfSupplies typeOfSuppliesTypeId) {
        this.typeOfSuppliesTypeId = typeOfSuppliesTypeId;
    }

    public Branches getBranchesBranchId() {
        return branchesBranchId;
    }

    public void setBranchesBranchId(Branches branchesBranchId) {
        this.branchesBranchId = branchesBranchId;
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
