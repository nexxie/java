package com.VakhovYS;

public class Main {

    public static void main(String[] args) {
        String h = new String();
        String m = new String();
        int count = 0;

        for (int i = 0; i < 24; i++) {

            if (i <= 9) {
                h = "0" + (String.valueOf(i));
            } else h = (String.valueOf(i));


            for (int n = 0; n < 60; n++) {
                if (n <= 9) {
                    m = "0" + (String.valueOf(n));
                } else m = (String.valueOf(n));


                String reverse = new StringBuffer(h).reverse().toString();
                if (new String(reverse).equals(m)) {
                    count++;
                    System.out.println(h + " : " + m);
                }

            }
        }
        System.out.println("Количество совпадений в часах и минутах: " + count);
    }
}