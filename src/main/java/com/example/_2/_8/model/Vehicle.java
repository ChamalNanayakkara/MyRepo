package com.example._2._8.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vehicleId;

    @ManyToOne
    @JoinColumn(name = "model")
    private Model model;

}
