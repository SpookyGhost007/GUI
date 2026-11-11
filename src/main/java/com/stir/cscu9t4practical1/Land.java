package com.stir.cscu9t4practical1;

import java.util.Date;

public class Land extends Entry {
    private int size;
    private String compos;
    private boolean natureReserve;

    public Land(String projectType, String type, int budget, String manager, String loc, String custID, int estDur,
                Date estStart, Date actStart, Date actEnd, int accCost, boolean notRenovated, int size, String compos,
                boolean natureReserve) {
        super(projectType, type, budget, manager, loc, custID, estDur, estStart, actStart, actEnd, accCost, notRenovated);
        this.size = size;
        this.compos = compos;
        this.natureReserve = natureReserve;
    }

    public int getSize() {
        return size;
    }

    public String getCompos() {
        return compos;
    }

    public boolean isNatureReserve() {
        return natureReserve;
    }

    public String getEntry() {
        String result = "Project: " + getProjectType() + " | Project type: " + getType() + " | Size: " + getSize()
                + " | Bedrooms: " + " | Flooding risk: " + " | Budget: " + getBudget() + " | Project manager: " + getManager()
                + " | Location: " + getLoc() + " | New?: " + isNotRenovated() + " | Customer ID: " + getCustID()
                + " | Estimated duration: " + getEstDur() + " | Estimated start: " + getEstStart() + " | Actual start: " + getActStart()
                + " | Actual end: " + getActEnd() + " | Accumulated cost: " + getAccCost() + " | Current Composition: "
                + " | Current Composition: " + getCompos() +" | Natural Reserve: " + isNatureReserve() + "\n";
        return result;
    }
}
