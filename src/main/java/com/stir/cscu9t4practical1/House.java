package com.stir.cscu9t4practical1;

import java.util.Date;

public class House extends Entry{
    private int size;
    private float bedrooms;
    private float landSize;
    private float bathrooms;
    private float floodingRisk;
    private boolean garage;
    private String material;
    private String roof;

    public House(String projectType, String type, int budget, String manager, String loc, String custID, int estDur,
                 Date estStart, Date actStart, Date actEnd, int accCost, boolean notRenovated, int size, float bedrooms,
                 float landSize, float bathrooms, float floodingRisk, boolean garage, String material, String roof) {
        super(projectType, type, budget, manager, loc, custID, estDur, estStart, actStart, actEnd, accCost, notRenovated);
        this.size = size;
        this.bedrooms = bedrooms;
        this.landSize = landSize;
        this.bathrooms = bathrooms;
        this.floodingRisk = floodingRisk;
        this.garage = garage;
        this.material = material;
        this.roof = roof;
    }

    public int getSize() {
        return size;
    }

    public float getBedrooms() {
        return bedrooms;
    }

    public float getLandSize() {
        return landSize;
    }

    public float getBathrooms() {
        return bathrooms;
    }

    public float getFloodingRisk() {
        return floodingRisk;
    }

    public boolean isGarage() {
        return garage;
    }

    public String getMaterial() {
        return material;
    }

    public String getRoof() {
        return roof;
    }

    public String getEntry () {
        String result = "Project: "+ getProjectType()+" | Project type: " + getType() + " | Size: " + getSize()
                +" | Bedrooms: " + getBedrooms() +" | Land size: " + getLandSize() +" | Bathrooms: " + getBathrooms()
                +" | Flooding risk: " + getFloodingRisk() +" | Garage: " + isGarage() +" | Building material: " + getMaterial()
                +" | Roof: " + getRoof() +" | Budget: " + getBudget() +" | Project manager: " + getManager()
                +" | Location: " + getLoc() +" | New?: " + isNotRenovated() +" | Customer ID: " + getCustID()
                +" | Estimated duration: " + getEstDur() +" | Estimated start: " + getEstStart() +" | Actual start: " + getActStart()
                +" | Actual end: " + getActEnd() +" | Accumulated cost: " + getAccCost() +"\n";
        return result;
    } //getEntry
}
