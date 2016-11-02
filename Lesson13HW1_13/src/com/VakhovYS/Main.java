package com.VakhovYS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0, i, c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число больше 3 : ");

        if (sc.hasNextInt()) {
            while (a < 3) {
                a = sc.nextInt();
                if (a < 3) System.out.print("Введите число больше 3 : ");
            }
        }

        int[] arr = new int[a];

        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (a + 1));
            if (arr[i] % 2 == 0) c++;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        if (c > 0) {
            int[] arr2 = new int[c];
            int b = 0;
            for (i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] != 0) {
                    arr2[b] = arr[i];
                    System.out.print(arr2[b] + " ");
                    b++;
                }
            }
        }

    }

}