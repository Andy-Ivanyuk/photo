package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "service_supplies")
@EntityListeners(AuditingEntityListener.class)
public class ServiceSupplies {

    @Id
    @Column(name = "service_supplies_id")
    private int serviceSuppliesId;
    private Date date;
    @ManyToOne
    private Kiosks kiosksKioskId;
    @ManyToOne
    private Services servicesServiceId;
    @ManyToOne
    private Clients clientsClientId;

    public ServiceSupplies(Date date, Kiosks kiosksKioskId, Services servicesServiceId,
                           Clients clientsClientId) {
        this.date = date;
        this.kiosksKioskId = kiosksKioskId;
        this.servicesServiceId = servicesServiceId;
        this.clientsClientId = clientsClientId;
    }

    public ServiceSupplies() {
    }

    public int getServiceSuppliesId() {
        return serviceSuppliesId;
    }

    public void setServiceSuppliesId(int serviceSuppliesId) {
        this.serviceSuppliesId = serviceSuppliesId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Kiosks getKiosksKioskId() {
        return kiosksKioskId;
    }

    public void setKiosksKioskId(Kiosks kiosksKioskId) {
        this.kiosksKioskId = kiosksKioskId;
    }

    public Services getServicesServiceId() {
        return servicesServiceId;
    }

    public void setServicesServiceId(Services servicesServiceId) {
        this.servicesServiceId = servicesServiceId;
    }

    public Clients getClientsClientId() {
        return clientsClientId;
    }

    public void setClientsClientId(Clients clientsClientId) {
        this.clientsClientId = clientsClientId;
    }
}
