package com.thanghnt2008110234.kiemtragiuaki;

import java.util.Scanner;

public class Apple {
    private String ma;
    private int khoiLuong;
    private String mauSac;

    public Apple() {
    }

    public Apple(String ma, int khoiLuong, String mauSac) {
        this.ma = ma;
        this.khoiLuong = khoiLuong;
        this.mauSac = mauSac;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "Apple{" + "ma=" + ma + ", khoiLuong=" + khoiLuong + ", mauSac=" + mauSac + '}';
    }
    
}