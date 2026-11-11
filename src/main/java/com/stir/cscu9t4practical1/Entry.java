// This class holds information about a single training session
package com.stir.cscu9t4practical1;

//test

import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry {
  private String projectType;
  private String type;
  private int budget;
  private String manager;
  private String loc;
  private String custID;
  private int estDur;
  private Date estStart;
  private Date actStart;
  private Date actEnd;
  private int accCost;
  private boolean notRenovated;

  public Entry(String projectType, String type, int budget, String manager, String loc, String custID, int estDur,
               Date estStart, Date actStart, Date actEnd, int accCost, boolean notRenovated) {
    this.projectType = projectType;
    this.type = type;
    this.budget = budget;
    this.manager = manager;
    this.loc = loc;
    this.custID = custID;
    this.estDur = estDur;
    this.estStart = estStart;
    this.actStart = actStart;
    this.actEnd = actEnd;
    this.accCost = accCost;
    this.notRenovated = notRenovated;
  }

  public String getProjectType() {
    return projectType;
  }

  public String getType() {
    return type;
  }

  public int getBudget() {
    return budget;
  }

  public String getManager() {
    return manager;
  }

  public String getLoc() {
    return loc;
  }

  public String getCustID() {
    return custID;
  }

  public int getEstDur() {
    return estDur;
  }

  public String getEstStart() {
    String dobString = new SimpleDateFormat("YYYY-MM-dd").format(estStart);
    return dobString;
  }

  public String getActStart() {
    String dobString = new SimpleDateFormat("YYYY-MM-dd").format(estStart);
    return dobString;
  }

  public String getActEnd() {
    String dobString = new SimpleDateFormat("YYYY-MM-dd").format(estStart);
    return dobString;
  }

  public int getAccCost() {
    return accCost;
  }

  public String isNotRenovated() {
    if (notRenovated){
      return "yes";
    }
    else{
      return "no";
    }
  }
  public String getEntry () {
    String result = "Project: " + getProjectType() + " | Project type: " + getType() + " | Budget: " + getBudget() + " | Project manager: " + getManager()
            + " | Location: " + getLoc() + " | New?: " + isNotRenovated() + " | Customer ID: " + getCustID()
            + " | Estimated duration: " + getEstDur() + " | Estimated start: " + getEstStart() + " | Actual start: " + getActStart()
            + " | Actual end: " + getActEnd() + " | Accumulated cost: " + getAccCost() + "\n";
    return result;
  }
} // Entry