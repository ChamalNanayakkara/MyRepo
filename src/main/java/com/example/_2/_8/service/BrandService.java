package com.example._2._8.service;


import com.example._2._8.controller.requestController.BrandRequest;
import org.springframework.stereotype.Service;

@Service
public interface BrandService {
    public void create(BrandRequest brandRequest);

    }
