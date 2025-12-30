package com.example._2._8.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  brandId;
    private String name;



    @OneToMany(mappedBy = "brand")
    private List<Model>model;

}
