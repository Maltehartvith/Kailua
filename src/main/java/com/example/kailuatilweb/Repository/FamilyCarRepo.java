package com.example.kailuatilweb.Repository;

import com.example.kailuatilweb.Model.FamilyCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FamilyCarRepo {

    @Autowired
    JdbcTemplate template;

    public List<FamilyCar> fetchAll(){
        String sql = "SELECT * FROM familycar";
        RowMapper<FamilyCar> rowMapper = new BeanPropertyRowMapper<>(FamilyCar.class);
        return template.query(sql, rowMapper);
    }
}