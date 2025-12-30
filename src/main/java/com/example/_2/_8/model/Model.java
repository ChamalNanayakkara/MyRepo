package com.example._2._8.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name ="model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long modelId;


    @ManyToOne
    @JoinColumn(name="model")
    private Type type;

    @ManyToOne
    @JoinColumn(name="brand")
    private Brand brand;

    @OneToMany(mappedBy = "model")
    private List<Vehicle>vehicle;
}
