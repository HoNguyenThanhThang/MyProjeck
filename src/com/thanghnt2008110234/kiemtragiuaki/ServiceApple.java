package com.thanghnt2008110234.kiemtragiuaki;

import java.util.ArrayList;
import java.util.Scanner;


public class ServiceApple {

    ArrayList<Apple> listApple = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Apple apple;
    String input;

    public void addApple() {
        System.out.println("Bạn muốn thêm bao nhiêu quả táo ? : ");
        input = sc.nextLine();
        for (int i = 0; i < Integer.parseInt(input); i++) {
            apple = new Apple();
            System.out.println("Mời bạn nhập mã táo : ");
            apple.setMa(sc.nextLine());
            System.out.println("Mời bạn nhập khối lượng táo : ");
            apple.setKhoiLuong(Integer.parseInt(sc.nextLine()));
            System.out.println("Mời bạn nhập màu sắc : ");
            apple.setMauSac(sc.nextLine());
            listApple.add(apple);
        }
        System.out.println("Bạn đã thêm thành công");
    }

    public void findApple() {
        System.out.println("Mời bạn nhập mã táo muốn tìm : ");
        input = sc.nextLine();
        for (Apple x : listApple) {
            if (x.getMa().trim().equals(input)) {
                System.out.println("Mã táo : " + x.getMa());
                System.out.println("Khối lượng táo : " + x.getKhoiLuong());
                System.out.println("Màu sắc táo : " + x.getMauSac());
            } else {
                System.out.println("Mã táo không tồn tại");
            }
        }
    }

    public void xuatRaManHinh() {
        for (Apple x : listApple) {
            System.out.println("Mã táo : " + x.getMa());
            System.out.println("Khối lượng táo : " + x.getKhoiLuong());
            System.out.println("Màu sắc táo : " + x.getMauSac());
        }
    }
}