package com.automatization.training.hashmap1.targil1;

public class Country {
    private String countryName;
    private String capitalName;
    private int areaCode;

    public Country (String countryName, String capitalName, int areaCode){
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.areaCode = areaCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
}
