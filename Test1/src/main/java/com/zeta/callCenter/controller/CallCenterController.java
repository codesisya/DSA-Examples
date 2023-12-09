package com.zeta.callCenter.controller;

import com.zeta.callCenter.model.Call;
import com.zeta.callCenter.model.EscalationPolicy;
import com.zeta.callCenter.model.Operator;
import com.zeta.callCenter.service.BookKeepingService;
import com.zeta.callCenter.service.OperatorService;

import java.util.ArrayList;
import java.util.List;

public class CallCenterController {
  OperatorService operatorService = new OperatorService();
  BookKeepingService bookKeepingService = new BookKeepingService();

  public void setUp(){
    List<EscalationPolicy> escalationPolicies = new ArrayList<EscalationPolicy>(); // reading from conf
    List<Operator> operators = new ArrayList<Operator>();// reading from conf
    operatorService.initialize(operators,escalationPolicies);
  }

  public String manageCall(Call c){

    operatorService.handleCall(c);
    bookKeepingService.handleBookKeepingInfo(c);
    return "200";
  }

}
