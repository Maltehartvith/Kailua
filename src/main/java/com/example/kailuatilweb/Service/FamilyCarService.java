package com.example.kailuatilweb.Service;

import com.example.kailuatilweb.Model.FamilyCar;
import com.example.kailuatilweb.Model.SportCar;
import com.example.kailuatilweb.Repository.FamilyCarRepo;
import com.example.kailuatilweb.Repository.SportCarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyCarService {

    @Autowired
    FamilyCarRepo familyCarRepo;

    public List<FamilyCar> fetchAll() {
        return familyCarRepo.fetchAll();
    }
}