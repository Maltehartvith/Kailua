package com.example.kailuatilweb.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class LuxuryCar {

        @Id
        private int luxuryCarID;
        private String type;
        private String brand;
        private String model;
        private String fuelType;
        private String plate;
        private String regYearAndMonth;
        private int drivenKM;
        private String gearType;
        private String hasAirCon;
        private String hasCC;
        private String interior;
        private String CCM;

        public LuxuryCar() {
        }


    public LuxuryCar(int luxuryCarID, String type, String brand, String model, String fuelType, String plate, String regYearAndMonth,
                     int drivenKM, String gearType, String hasAirCon, String hasCC, String interior, String CCM) {

            this.type = type;
            this.brand = brand;
            this.model = model;
            this.fuelType = fuelType;
            this.plate = plate;
            this.regYearAndMonth = regYearAndMonth;
            this.drivenKM = drivenKM;
            this.gearType = gearType;
            this.hasAirCon = hasAirCon;
            this.hasCC = hasCC;
            this.interior = interior;
            this.CCM = CCM;
        }
        public int getLuxuryCarID() {
            return luxuryCarID;
        }

        public void setLuxuryCarID(int luxuryCarID) {
            this.luxuryCarID = luxuryCarID;
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

        public String getHasAirCon() {
            return hasAirCon;
        }

        public void setHasAirCon(String hasAirCon) {
            this.hasAirCon = hasAirCon;
        }

        public String getHasCC() {
            return hasCC;
        }

        public void setHasCC(String hasCC) {
            this.hasCC = hasCC;
        }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getCCM() {
        return CCM;
    }

    public void setCCM(String CCM) {
        this.CCM = CCM;
    }
}
