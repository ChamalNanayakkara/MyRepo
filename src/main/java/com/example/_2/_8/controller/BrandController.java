package com.example._2._8.controller;

import com.example._2._8.controller.requestController.BrandRequest;
import com.example._2._8.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
    

    private BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping(value = "create",headers = "x-api-version=v1")
    public void create(@RequestBody BrandRequest brandRequest){


        brandService.create(brandRequest);
        return;

    }
}
