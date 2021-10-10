package com.thanghnt2008110234.tuan1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine(); 
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %f điểm", hoTen, diemTB);
        scanner.close();
    }
}
