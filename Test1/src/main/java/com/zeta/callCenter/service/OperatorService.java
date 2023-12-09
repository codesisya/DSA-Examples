package com.zeta.callCenter.service;

import com.zeta.callCenter.model.*;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class OperatorService {
  private BlockingQueue<Operator> operators;
  List<EscalationPolicy> escalationPolicies;
  private Queue<Call> callQueue;
  Queue<Call> inProgressCalls;
  List<Operator> restingOperators = new ArrayList<>();

  public void initialize(List<Operator> operators, List<EscalationPolicy> escalationPolicies){

  }

  public boolean handleCall(Call call){
    if(operators.isEmpty()){
      callQueue.add(call);
    }
    Operator o = operators.poll();
    if(!o.isResting() && ! (o instanceof Supervisor )){
      assignJob(o, call);
    }
    else{
      int n = operators.size();
      operators.add(o);
      while(n-- >0 && o instanceof  Supervisor){
        Operator o1 = operators.poll();
        operators.add(o1);
      }
      o = operators.poll();
      assignJob(o, call);
    }

    return true;

  }

  private boolean assignJob(Operator o , Call call){
    call.setCallStatus(CallStatus.IN_PROGRESS);
    inProgressCalls.add(call);
    o.setServing(true);
    return true;
  }


  public boolean escalate(Call call){
    return true;
  }

  }
