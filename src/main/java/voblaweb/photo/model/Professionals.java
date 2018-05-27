package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "professionals")
@EntityListeners(AuditingEntityListener.class)
public class Professionals {

    @Id
    @Column(name = "professionals_id")
    private int professionalId;
    @ManyToOne
    private Clients clientsClientId;
    private Boolean personalDiscount;

    public Professionals(Clients clientsClientId, Boolean personalDiscount) {
        this.clientsClientId = clientsClientId;
        this.personalDiscount = personalDiscount;
    }

    public Professionals() {
    }

    public int getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(int professionalId) {
        this.professionalId = professionalId;
    }

    public Clients getClientsClientId() {
        return clientsClientId;
    }

    public void setClientsClientId(Clients clientsClientId) {
        this.clientsClientId = clientsClientId;
    }

    public Boolean getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(Boolean personalDiscount) {
        this.personalDiscount = personalDiscount;
    }
}
