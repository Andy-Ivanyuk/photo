package voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "branches")
@EntityListeners(AuditingEntityListener.class)
public class Branches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private int branchId;
    private String branchAddress;
    private int branchAmountOfWorkplaces;

    public Branches(String branchAddress, int branchAmountOfWorkplaces) {
        this.branchAddress = branchAddress;
        this.branchAmountOfWorkplaces = branchAmountOfWorkplaces;
    }

    public Branches() {
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public int getBranchAmountOfWorkplaces() {
        return branchAmountOfWorkplaces;
    }

    public void setBranchAmountOfWorkplaces(int branchAmountOfWorkplaces) {
        this.branchAmountOfWorkplaces = branchAmountOfWorkplaces;
    }
}
