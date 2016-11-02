package com.VakhovYS;

public class Main {

    public static void main(String[] args) {

        int a = 0;

        for (int i = 4; i <= 999994; i++) {
            String s = String.valueOf(i);
            if (s.indexOf('4') != -1) {
                a++;
            } else if (s.indexOf('1') != -1 & s.indexOf('1' + 1) == s.indexOf('3')) {
                a++;
            }
        }
        System.out.println(a);

    }
}
