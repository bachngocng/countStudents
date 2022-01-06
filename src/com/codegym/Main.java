package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng học sinh: ");
        size = scanner.nextInt();
        if (size > 30)
            System.out.println("Số lượng học sinh không vượt quá 30");
        while (size > 30) ;
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập điểm của học sinh " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.println("\n Số học sinh vượt qua bài kiểm tra là: " + count);
    }
}
