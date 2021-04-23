package com.example.kailuatilweb.Service;

import com.example.kailuatilweb.Model.SportCar;
import com.example.kailuatilweb.Repository.SportCarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportCarService {

    @Autowired
    SportCarRepo sportCarRepo;

    public List<SportCar> fetchAll() {
        return sportCarRepo.fetchAll();
    }

    public SportCar addSportCar(SportCar sportCar){
        return sportCarRepo.addSportCar(sportCar);
    }
    public Boolean delete(int id) {
        return sportCarRepo.delete(id);
    }

   public  SportCar findSportcarById(int id) {
        return sportCarRepo.findSportcarById(id);
   }
   public SportCar updateSportCar(int id, SportCar sportCar){
        return sportCarRepo.updateSportCar(id, sportCar);
   }
}
