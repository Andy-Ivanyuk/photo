package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "lovers")
@EntityListeners(AuditingEntityListener.class)
public class Lovers {

    @Id
    @Column(name = "lover_id")
    private int loverId;
    @ManyToOne
    private Clients clientsClientId;

    public Lovers(Clients clientsClientId) {
        this.clientsClientId = clientsClientId;
    }

    public Lovers() {
    }

    public int getLoverId() {
        return loverId;
    }

    public void setLoverId(int loverId) {
        this.loverId = loverId;
    }

    public Clients getClientsClientId() {
        return clientsClientId;
    }

    public void setClientsClientId(Clients clientsClientId) {
        this.clientsClientId = clientsClientId;
    }
}
