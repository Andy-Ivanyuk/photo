package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "services")
@EntityListeners(AuditingEntityListener.class)
public class Services {

    @Id
    @Column(name = "services_id")
    private int serviceId;
    private String serviceName;
    private int servicePrice;

    public Services(String serviceName, int servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public Services() {
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }
}
