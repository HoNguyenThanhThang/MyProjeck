package com.thanghnt2008110234.tuan3;

import java.util.Scanner;

public class Lab3bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần kiểm tra: ");
        int n = scanner.nextInt();
        scanner.close();
        boolean ok = true;
        for(int i = 2; i < n-1; i++){
            if(n%i == 0){
                ok = false;
                break;
            }
        }
        if(ok)
            System.out.println(n + " là số nguyên tố");
        
        else
            System.out.println(n + " không là số nguyên tố");
        
    }
    
}
