package org.sou.lambda;

import org.sou.lambda.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
  public static void main(String[] args) {
    Person p = new Person(1,"sou",5);
    Person p1 = new Person(2,"gou",10);
    Person p2 = new Person(3,"kou",20);
    Person p3 = new Person(4,"push",15);
    Person p4 = new Person(5,"san",30);
    Person p5 = new Person(6,"bid",60);
    Person[] persons = {p,p1,p2,p3,p4,p5};
    List<String> names = Arrays.stream(persons)
            .sorted((a,b)->a.getAge()-b.getAge())
            .limit(3)
            .map(a->a.getName())
            .collect(Collectors.toList());
    String namesConcatenated = Arrays.stream(persons)
            .sorted((a,b)->a.getAge()-b.getAge())
            .limit(3)
            .map(a->a.getName())
            .collect(Collectors.joining(","));
    System.out.println(names);
    System.out.println(namesConcatenated);
  }
}
