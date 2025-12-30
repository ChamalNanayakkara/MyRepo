package com.example._2._8.service.impl;

import com.example._2._8.controller.requestController.BrandRequest;
import com.example._2._8.model.Brand;
import com.example._2._8.repository.BrandRepository;
import com.example._2._8.service.BrandService;
import org.springframework.stereotype.Service;


@Service
public class BrandServiceImpl implements BrandService {

    private BrandRepository brandRepository;
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public void create(BrandRequest brandRequest) {

        Brand brand=new Brand();
        brand.setName(brandRequest.getName());
        brandRepository.save(brand);
        System.out.println("Brand created successfully..."+"BrandId:"+brand.getName() +" BrandName:"+brand.getName());


    }
}
