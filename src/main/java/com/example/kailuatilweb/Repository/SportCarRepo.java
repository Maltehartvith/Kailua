package com.example.kailuatilweb.Repository;

import com.example.kailuatilweb.Model.SportCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SportCarRepo {

    @Autowired
    JdbcTemplate template;

    public List<SportCar> fetchAll(){
        String sql = "SELECT * FROM sportcar";
        RowMapper<SportCar> rowMapper = new BeanPropertyRowMapper<>(SportCar.class);
        return template.query(sql, rowMapper);
    }
    public SportCar addSportCar(SportCar sportCar){
        String sql = "INSERT INTO sportcar(SportCarID, type, brand, model, fuelType, plate, regYearAndMonth, drivenKM," +
                "gearType, horsePower) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        template.update(sql, sportCar.getSportCarID(), sportCar.getType(), sportCar.getBrand(), sportCar.getModel(),
                sportCar.getFuelType(), sportCar.getPlate(), sportCar.getRegYearAndMonth(), sportCar.getDrivenKM(),
                sportCar.getGearType(), sportCar.getHorsePower());
        return null;
    }

    public Boolean delete(int id) {
        String sql = "DELETE FROM sportcar WHERE id = ?";
        return template.update(sql, id) > 0;
    }

    //update sportcar id
    public SportCar findSportcarById(int sportCarID) {
        String sql ="SELECT * FROM sportcar WHERE SportCarID =?";
        RowMapper<SportCar> rowMapper = new BeanPropertyRowMapper<>(SportCar.class);
        SportCar sc = template.queryForObject(sql, rowMapper, sportCarID);
        return sc;
    }

    public SportCar updateSportCar(int id, SportCar sportCar){
        String sql = "UPDATE sportcar SET type = ?, brand = ?, model = ?, fuelType = ?, plate = ?, " +
                "regYearAndMonth = ?, drivenKM = ?, gearType = ?, horsePower = ?  WHERE SportCarID = ?";

        template.update(sql, sportCar.getType(), sportCar.getBrand(), sportCar.getModel(),
                sportCar.getFuelType(), sportCar.getPlate(), sportCar.getRegYearAndMonth(), sportCar.getDrivenKM(),
                sportCar.getGearType(), sportCar.getHorsePower(), sportCar.getSportCarID());
        return null;
    }
}
