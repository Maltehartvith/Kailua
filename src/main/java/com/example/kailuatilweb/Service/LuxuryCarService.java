package com.example.kailuatilweb.Service;

import com.example.kailuatilweb.Model.LuxuryCar;
import com.example.kailuatilweb.Model.SportCar;
import com.example.kailuatilweb.Repository.LuxuryCarRepo;
import com.example.kailuatilweb.Repository.SportCarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LuxuryCarService {

    @Autowired
    LuxuryCarRepo luxuryCarRepo;

    public List<LuxuryCar> fetchAll() {
        return luxuryCarRepo.fetchAll();
    }
}