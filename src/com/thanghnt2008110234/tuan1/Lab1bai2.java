package com.thanghnt2008110234.tuan1;

import java.util.Scanner;

public class Lab1bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cạnh dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Cạnh rộng: ");
        double rong = scanner.nextDouble();
        double chuVi = (dai + rong)*2;
        double dienTich = dai*rong;
        double canhNhoNhat = Math.min(dai, rong);
        System.out.printf("Chu Vi: %.1f\n", chuVi);
        System.out.printf("Diện tích: %.1f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.1f", canhNhoNhat);
        scanner.close();
    }
}
