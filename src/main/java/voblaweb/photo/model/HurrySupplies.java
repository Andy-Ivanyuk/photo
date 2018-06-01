package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hurry_supplies")
@EntityListeners(AuditingEntityListener.class)
public class HurrySupplies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int price;
    private int amountOfPhotosPerFrame;
    private int totalAmountOfPhotos;
    private String format;
    private String paperType;
    private Date supplyDate;
    private Boolean isDone;;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "branchId")
    private Branches branchId;;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "clientId")
    private Clients clientId;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "typeOfSupplyId")
    private TypeOfSupplies typeOfSupplyId;

    public HurrySupplies() {
    }

    public HurrySupplies(int price,
                         int amountOfPhotosPerFrame, int totalAmountOfPhotos, String format,
                         String paperType, Date supplyDate, Boolean isDone, Branches branchId,
                         Clients clientId, TypeOfSupplies typeOfSupplyId) {
        this.price = price;
        this.amountOfPhotosPerFrame = amountOfPhotosPerFrame;
        this.totalAmountOfPhotos = totalAmountOfPhotos;
        this.format = format;
        this.paperType = paperType;
        this.supplyDate = supplyDate;
        this.isDone = isDone;
        this.branchId = branchId;
        this.clientId = clientId;
        this.typeOfSupplyId = typeOfSupplyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Branches getBranchId() {
        return branchId;
    }

    public void setBranchId(Branches branchId) {
        this.branchId = branchId;
    }

    public Clients getClientId() {
        return clientId;
    }

    public void setClientId(Clients clientId) {
        this.clientId = clientId;
    }

    public TypeOfSupplies getTypeOfSupplyId() {
        return typeOfSupplyId;
    }

    public void setTypeOfSupplyId(TypeOfSupplies typeOfSupplyId) {
        this.typeOfSupplyId = typeOfSupplyId;
    }
}
