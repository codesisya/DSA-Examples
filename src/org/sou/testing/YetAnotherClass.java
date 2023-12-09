package org.sou.testing;

import java.util.ArrayList;
import java.util.List;

public class YetAnotherClass {
    public static void main(String[] args) {
        System.out.println();
        List<Integer> intl = new ArrayList<>();
        intl.add(5);
        intl.add(5);
        calculate(5);
        System.out.println("calcularion done");
    }

    public static void calculate(int n) {
        System.out.println("in clculating");
        System.out.println(Math.pow(2, n));
    }
}
