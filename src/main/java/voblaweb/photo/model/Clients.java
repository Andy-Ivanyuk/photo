package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@EntityListeners(AuditingEntityListener.class)
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int clientId;
    @Column(name = "client_name")
    private String clientName;
    private Boolean discountCard;
    @ManyToOne
    private Branches branchesBranchId;

    public Clients(String clientName, Boolean discountCard, Branches branchesBranchId) {
        this.clientName = clientName;
        this.discountCard = discountCard;
        this.branchesBranchId = branchesBranchId;
    }

    public Clients() {
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getBranchName() {
        return clientName;
    }

    public void setBranchName(String branchName) {
        this.clientName = branchName;
    }

    public Boolean getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(Boolean discountCard) {
        this.discountCard = discountCard;
    }

    public Branches getBranchesBranchId() {
        return branchesBranchId;
    }

    public void setBranchesBranchId(Branches branchesBranchId) {
        this.branchesBranchId = branchesBranchId;
    }
}
