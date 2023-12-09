package com.zeta.callCenter.model;

public abstract class EscalationPolicy {

  abstract boolean escalate(Call call);
}
