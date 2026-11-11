package com.stir.cscu9t4practical1;

import java.util.Date;

public class Tunnel extends Entry {
    private String excav;
    private int width;
    private String overlay;
    private boolean safeTunnel;
    private int length;
    private float stability;

    public Tunnel(String projectType, String type, int budget, String manager, String loc, String custID, int estDur,
                  Date estStart, Date actStart, Date actEnd, int accCost, boolean notRenovated, String excav, int width,
                  String overlay, boolean safeTunnel, int length, float stability) {
        super(projectType, type, budget, manager, loc, custID, estDur, estStart, actStart, actEnd, accCost, notRenovated);
        this.excav = excav;
        this.width = width;
        this.overlay = overlay;
        this.safeTunnel = safeTunnel;
        this.length = length;
        this.stability = stability;
    }

    public String getExcav() {
        return excav;
    }

    public int getWidth() {
        return width;
    }

    public String getOverlay() {
        return overlay;
    }

    public boolean isSafeTunnel() {
        return safeTunnel;
    }

    public int getLength() {
        return length;
    }

    public float getStability() {
        return stability;
    }

    public String getEntry() {
        String result = "Project: " + getProjectType() + " | Project type: " + getType() + " | Budget: " + getBudget() + " | Project manager: " + getManager()
                + " | Location: " + getLoc() + " | New?: " + isNotRenovated() + " | Customer ID: " + getCustID()
                + " | Estimated duration: " + getEstDur() + " | Estimated start: " + getEstStart() + " | Actual start: " + getActStart()
                + " | Actual end: " + getActEnd() + " | Accumulated cost: " + getAccCost() + " | Excavation: " + getExcav()
                + " | Width: " + getWidth() + " | Overlay: " + getOverlay() + " | Safe Tunnel: " + isSafeTunnel()
                + " | Length: " + getLength() + " | Ground structural stability: " + getStability() + "\n";
        return result;
    }
}
