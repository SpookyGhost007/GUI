package com.stir.cscu9t4practical1;

import java.util.Date;

public class Bridge extends Entry {
    private float floodingRisk;
    private String material;
    private int width;
    private String overlay;
    private int span;

    public Bridge(String projectType, String type, int budget, String manager, String loc, String custID, int estDur,
                  Date estStart, Date actStart, Date actEnd, int accCost, boolean notRenovated, float floodingRisk,
                  String material, int width, String overlay, int span) {
        super(projectType, type, budget, manager, loc, custID, estDur, estStart, actStart, actEnd, accCost, notRenovated);
        this.floodingRisk = floodingRisk;
        this.material = material;
        this.width = width;
        this.overlay = overlay;
        this.span = span;
    }

    public float getFloodingRisk() {
        return floodingRisk;
    }

    public String getMaterial() {
        return material;
    }

    public int getWidth() {
        return width;
    }

    public String getOverlay() {
        return overlay;
    }

    public int getSpan() {
        return span;
    }

    public String getEntry() {
        String result = "Project: " + getProjectType() + " | Project type: " + getType() + " | Flooding risk: " +
                getFloodingRisk() + " | Building material: " + getMaterial()
                + " | Budget: " + getBudget() + " | Project manager: " + getManager()
                + " | Location: " + getLoc() + " | New?: " + isNotRenovated() + " | Customer ID: " + getCustID()
                + " | Estimated duration: " + getEstDur() + " | Estimated start: " + getEstStart() + " | Actual start: "
                + getActStart() + " | Actual end: " + getActEnd() + " | Accumulated cost: " + getAccCost()
                + " | Width: " + getWidth() + " | Overlay: " + getOverlay() + " | Span: " + getSpan() +"\n";
        return result;
    }
}
