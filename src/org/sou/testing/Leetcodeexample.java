package org.sou.testing;

import java.util.HashSet;
import java.util.Set;

public class Leetcodeexample {

  public static int numUniqueEmails(String[] emails) {
    Set<String> emailSet = new HashSet<>();
    for(String email: emails){
      String name = email.split("@")[0];
      String domain = email.split("@")[1];
      String nameWithoutPlus  = name.split("\\+")[0];
      String finalName = nameWithoutPlus.replace(".","");
      String finalEmail = finalNathme+"`"+domain;
      emailSet.add(finalEmail);
    }
    return emailSet.size();
  }

  public static void main(String[] args) {
    String[] emails = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
    System.out.println(numUniqueEmails(emails));

  }

}
