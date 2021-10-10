package com.thanghnt2008110234.tuan1;

import java.util.Scanner;

public class Lab1bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(delta);
        System.out.printf("Delta: %.1f\n", delta);
        System.out.printf("Căn của Delta: %.1f\n", canDelta);
        scanner.close();  
    }
    
}
