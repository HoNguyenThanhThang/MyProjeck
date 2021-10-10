package com.thanghnt2008110234.tuan1;

import java.util.Scanner;

public class lab1bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài cạnh: ");
        double canh = scanner.nextDouble();
        double dienTich = Math.pow(canh, 3);
        System.out.printf("Diện tích là: %.1f", dienTich);
        scanner.close();
    }
}
