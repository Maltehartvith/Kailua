package com.example.kailuatilweb.Repository;


import com.example.kailuatilweb.Model.LuxuryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LuxuryCarRepo {

    @Autowired
    JdbcTemplate template;

    public List<LuxuryCar> fetchAll(){
        String sql = "SELECT * FROM luxurycar";
        RowMapper<LuxuryCar> rowMapper = new BeanPropertyRowMapper<>(LuxuryCar.class);
        return template.query(sql, rowMapper);
    }
}