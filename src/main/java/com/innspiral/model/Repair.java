package com.innspiral.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="Repair")
public class Repair implements Comparable<Repair>{
    @Id
    @GeneratedValue
    private Long id;
    private Long vehicleId;
    private String comments;
    private Instant date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public int compareTo(Repair repair){
        return -this.getDate().compareTo(repair.getDate());
    }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", vehicleId=" + vehicleId +
                ", comments='" + comments + '\'' +
                ", date=" + date +
                '}';
    }
}
