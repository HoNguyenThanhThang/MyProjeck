package com.thanghnt2008110234.kiemtragiuaki;

import java.util.ArrayList;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
                ServiceApple b = new ServiceApple();
                Scanner sc = new Scanner(System.in);
                String a;
                do {
                    System.out.printf("Chức năng : \n");
                    System.out.printf("1. Thêm táo vào kho \n");
                    System.out.printf("2. Tìm kiếm táo trong kho \n");
                    System.out.printf("3. In ra danh sách táo có trong kho \n");
                    System.out.println("4, Thoát");
                    System.out.println("Mời bạn chọn chức năng : ");
                    a = sc.nextLine();
                    switch (a) {
                        case "1":
                            b.addApple();
                            break;
                        case "2":
                            b.findApple();
                            break;
                        case "3":
                            b.xuatRaManHinh();
                            break;
                        default:
                            System.out.println("Chức năng không tồn tại");
                    }
                } while (!(a.equals("4")));
            }
        
        
    

}