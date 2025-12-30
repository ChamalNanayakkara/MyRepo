package com.example._2._8.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Entity
@Data
@Table(name ="type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long typeID;
    private long name;

    @OneToMany(mappedBy = "type")
    private List<Model> model;
}
