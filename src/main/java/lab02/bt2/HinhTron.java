/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt2;

/**
 *
 * @author HOME
 */
public class HinhTron {

    private double bankinh;

    public HinhTron() {
        this(1.0);
    }

    public HinhTron(double bankinh) {

        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;

    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public double tinhDienTich() {
        return Math.PI * bankinh * bankinh;
    }

    public double tinhChuVi() {
        return Math.PI * 2 * bankinh;
    }
}

