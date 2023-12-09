package org.sou.comparator;

import java.util.*;

class Student implements Comparable<Student>{
  int id;
  String name;
  int age;

  public Student(int i, String n, int a) {
    id = i;
    name = n;
    age = a;
  }

  @Override
  public String toString() {
    return id + " " + name + " " + age;

  }

  @Override
  public int compareTo(Student o) {
    return this.name.compareTo(o.name);
  }
}

class AgeComparator implements Comparator<Student> {
  @Override
  public int compare(Student s1, Student s2){
    return s1.age - s2.age;
  }

}

public class DefaultExample {


  public static void main(String[] args) {
    Student s = new Student(1, "sou", 15);
    Student s1 = new Student(2, "sri", 20);
    Student s2 = new Student(3, "kou", 25);
    Student s3 = new Student(3, "pal", 5);
    List<Student> l = new ArrayList<>();
    l.add(s);
    l.add(s1);
    l.add(s2);
    l.add(s3);
    l.sort(new AgeComparator());
    System.out.println(l);
    Collections.sort(l);
    System.out.println(l);

  }
}
