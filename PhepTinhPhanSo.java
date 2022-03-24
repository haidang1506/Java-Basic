/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan11_OnLuyen;

import static Phan11_OnLuyen.RutGonPhanSo.RutGon;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class PhepTinhPhanSo {
    
    public static void CongPhanSo(int tuso1, int mauso1, int tuso2, int mauso2){
        if (mauso1==mauso2){
            int tuso = tuso1 + tuso2;
            System.out.println("Ket qua cua phep cong la: "+tuso+"/"+mauso1);
        }
        else {
            int ts1 = tuso1*mauso2;
            int ts2 = tuso2*mauso1;
            int mauso = mauso1*mauso2;
            System.out.print("Ket qua cua phep cong la: ");
            RutGon(ts1+ts2, mauso);
        }
    }
    
    public static void TruPhanSo(int tuso1, int mauso1, int tuso2, int mauso2){
        if (mauso1==mauso2){
            int tuso = tuso1 - tuso2;
            System.out.println("Ket qua cua phep tru la: "+tuso+"/"+mauso1);
        }
        else {
            int ts1 = tuso1*mauso2;
            int ts2 = tuso2*mauso1;
            int mauso = mauso1*mauso2;
            System.out.print("Ket qua cua phep tru la: ");
            RutGon(ts1-ts2, mauso);
        }
    }
    
    public static void NhanPhanSo(int tuso1, int mauso1, int tuso2, int mauso2){
        int tuso = tuso1*tuso2;
        int mauso = mauso1*mauso2;
        System.out.print("Ket qua phep nhan la: ");
        RutGon(tuso,mauso);
    }
    
    public static void ChiaPhanSo(int tuso1, int mauso1, int tuso2, int mauso2){
        int tuso = tuso1*mauso2;
        int mauso = mauso1*tuso2;
        System.out.print("Ket qua phep chia la: ");
        RutGon(tuso,mauso);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 phan so");
        System.out.println("Phan so thu nhat: ");
        System.out.print("Tu so: ");
        int tuso1 = sc.nextInt();
        System.out.print("Mau so: ");
        int mauso1 = sc.nextInt();
        System.out.println("Phan so thu hai: ");
        System.out.print("Tu so: ");
        int tuso2 = sc.nextInt();
        System.out.print("Mau so: ");
        int mauso2 = sc.nextInt();
        
        System.out.print("Nhap phep tinh (+,-,*,/): ");
        char pt = sc.next().charAt(0);
        switch (pt){
            case '+':
                CongPhanSo(tuso1, mauso1, tuso2, mauso2);
                break;
            case '-':
                TruPhanSo(tuso1, mauso1, tuso2, mauso2);
                break;
            case '*':
                NhanPhanSo(tuso1, mauso1, tuso2, mauso2);
                break;
            case '/':
                ChiaPhanSo(tuso1, mauso1, tuso2, mauso2);
                break;
            default: 
                System.out.println("Nhap 1 trong 4 phep tinh tren !");
                break;
        }
    }
}
