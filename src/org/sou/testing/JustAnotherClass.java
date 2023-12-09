package org.sou.testing;

import java.io.BufferedReader;
import java.io.FileReader;

public class JustAnotherClass {
    public static void main(String[] args) throws Exception{
        if (1==5) {
            BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));
        } else {
        }
        someFn();
    }

    public static void someFn(){
        System.out.println("ASdasf");
        int k;

        for(int i=0;i<5;i++)
            System.out.println(i);
    }
}
