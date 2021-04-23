package com.example.kailuatilweb.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SportCar {

    @Id
    private int sportCarID;
    private String type;
    private String brand;
    private String model;
    private String fuelType;
    private String plate;
    private String regYearAndMonth;
    private int drivenKM;
    private String gearType;
    private int horsePower;

    public SportCar() {
    }

    public SportCar(int sportCarID, String type, String brand, String model, String fuelType, String plate, String regYearAndMonth, int drivenKM, String gearType, int horsePower) {
        this.sportCarID = sportCarID;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.plate = plate;
        this.regYearAndMonth = regYearAndMonth;
        this.drivenKM = drivenKM;
        this.gearType = gearType;
        this.horsePower = horsePower;
    }

    public int getSportCarID() {
        return sportCarID;
    }

    public void setSportCarID(int sportCarID) {
        this.sportCarID = sportCarID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getRegYearAndMonth() {
        return regYearAndMonth;
    }

    public void setRegYearAndMonth(String regYearAndMonth) {
        this.regYearAndMonth = regYearAndMonth;
    }

    public int getDrivenKM() {
        return drivenKM;
    }

    public void setDrivenKM(int drivenKM) {
        this.drivenKM = drivenKM;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}

