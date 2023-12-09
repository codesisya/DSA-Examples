package com.zeta.callCenter.model;

import java.util.Date;

public class Call {
  private String callId;
  private int duration;
  private Date startTime;
  private Operator operator;
  private String userId;
  private CallStatus callStatus;
  boolean isEscalated;

  public boolean isEscalated() {
    return isEscalated;
  }

  public void setEscalated(boolean escalated) {
    isEscalated = escalated;
  }

  public String getCallId() {
    return callId;
  }

  public void setCallId(String callId) {
    this.callId = callId;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Operator getOperator() {
    return operator;
  }

  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public CallStatus getCallStatus() {
    return callStatus;
  }

  public void setCallStatus(CallStatus callStatus) {
    this.callStatus = callStatus;
  }
}
