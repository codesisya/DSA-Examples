package com.zeta.callCenter.model;

public class EscalateNExtManager extends EscalationPolicy {
  boolean escalate(Call call) {

    call.setEscalated(true);
    return true;
  }
}
