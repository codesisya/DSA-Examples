package com.zeta.callCenter.model;

public class Operator {
  protected String uid;
  protected String firstNAme;
  protected String lastNAme;
  protected boolean isResting;
  protected boolean isServing;
  protected Operator manager;

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getFirstNAme() {
    return firstNAme;
  }

  public void setFirstNAme(String firstNAme) {
    this.firstNAme = firstNAme;
  }

  public String getLastNAme() {
    return lastNAme;
  }

  public void setLastNAme(String lastNAme) {
    this.lastNAme = lastNAme;
  }

  public boolean isResting() {
    return isResting;
  }

  public void setResting(boolean resting) {
    isResting = resting;
  }

  public boolean isServing() {
    return isServing;
  }

  public void setServing(boolean serving) {
    isServing = serving;
  }

  public Operator getManager() {
    return manager;
  }

  public void setManager(Operator manager) {
    this.manager = manager;
  }


}
