/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan11_OnLuyen;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NgayTiepTheo {
    public static boolean NamNhuan(int nam){
        if ((nam%4==0 && nam%100!=0) || (nam%400==0)){
            return true;
        }
        return false;
    }
    
    public static int SoNgayTrongThang(int thang, int nam){
        if (thang==1 || thang==3 || thang==5 || thang==7 || thang==8 || thang==10 || thang==12){
            return 31;
        }
        else if (thang==4 || thang==6 || thang==9 || thang==11){
            return 30;
        }
        else {
            if (NamNhuan(nam)){
                return 29;
            }
            return 28;
        }
    }
    
    public static void NgayTiepTheo(int ngay, int thang, int nam){
        if (ngay<SoNgayTrongThang(thang,nam)){
            ngay+=1;
            System.out.println("Ngay tiep theo: "+ngay+"/"+thang+"/"+nam);
        }
        else{
            if (ngay==SoNgayTrongThang(thang,nam) && thang!=12){
                ngay=1;
                thang+=1;
                System.out.println("Ngay tiep theo: "+ngay+"/"+thang+"/"+nam);
            }
            else if (ngay==SoNgayTrongThang(thang,nam) && thang==12){
                ngay=1;
                thang=1;
                nam+=1;
                System.out.println("Ngay tiep theo: "+ngay+"/"+thang+"/"+nam);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        int thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();
        NgayTiepTheo(ngay,thang,nam);
    }
}
