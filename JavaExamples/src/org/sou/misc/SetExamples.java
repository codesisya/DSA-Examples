package org.sou.misc;

import java.util.*;

public class SetExamples {

  public static void main(String[] args) {
    Set<String> s = new TreeSet<String >();
    s.add("20200101");
    s.add("20200103");
    s.add("20200107");
    s.add("20200102");
    s.add("20200103");
    System.out.println(s);
    Queue<String> l = new LinkedList<>();
    ((LinkedList<String>) l).push("20200107");
    ((LinkedList<String>) l).addFirst("20200106");
    ((LinkedList<String>) l).addFirst("20200105");
    ((LinkedList<String>) l).addFirst("20200104");
    ((LinkedList<String>) l).addFirst("20200103");
    ((LinkedList<String>) l).addFirst("20200102");
    ((LinkedList<String>) l).addFirst("20200101");


    System.out.println(l);
    l.remove();
    System.out.println(l);
    l.add("20200108");
    System.out.println(l);
    l.remove();
    System.out.println(l);
    Map<String,String>m = new HashMap<>();
    m.putIfAbsent("20200908","dsg");
    m.put(l.poll(),"abcd");
    System.out.println(m);
    System.out.println(l);
    HashMap<String ,Integer> mm = new HashMap<>();
    mm.put("wqe",1);

  }
}
