package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "kiosks")
@EntityListeners(AuditingEntityListener.class)
public class Kiosks {

    @Id
    @Column(name = "kiosk_id")
    private int kioskId;
    private String kioskAddress;
    private int kioskAmountOfWorkplaces;
    @ManyToOne
    private Branches branchesBranchId;

    public Kiosks(String kioskAddress, int kioskAmountOfWorkplaces, Branches branchesBranchId) {
        this.kioskAddress = kioskAddress;
        this.kioskAmountOfWorkplaces = kioskAmountOfWorkplaces;
        this.branchesBranchId = branchesBranchId;
    }

    public Kiosks() {
    }

    public int getKioskId() {
        return kioskId;
    }

    public void setKioskId(int kioskId) {
        this.kioskId = kioskId;
    }

    public String getKioskAddress() {
        return kioskAddress;
    }

    public void setKioskAddress(String kioskAddress) {
        this.kioskAddress = kioskAddress;
    }

    public int getKioskAmountOfWorkplaces() {
        return kioskAmountOfWorkplaces;
    }

    public void setKioskAmountOfWorkplaces(int kioskAmountOfWorkplaces) {
        this.kioskAmountOfWorkplaces = kioskAmountOfWorkplaces;
    }

    public Branches getBranchesBranchId() {
        return branchesBranchId;
    }

    public void setBranchesBranchId(Branches branchesBranchId) {
        this.branchesBranchId = branchesBranchId;
    }
}
