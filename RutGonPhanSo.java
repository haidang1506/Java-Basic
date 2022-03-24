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
public class RutGonPhanSo {
    public static void RutGon(int tuso, int mauso){
        int min;
        if (tuso<mauso){
            min = tuso;
        }
        else{
            min = mauso;
        }
        for (int i=min; i>1; i--){
            if (tuso%i==0 && mauso%i==0){
                tuso/=i;
                mauso/=i;
            }
        }
        System.out.println(tuso+"/"+mauso);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan so:");
        System.out.print("Nhap tu so: ");
        int tuso = sc.nextInt();
        System.out.print("Nhap mau so: ");
        int mauso = sc.nextInt();
        System.out.println("Phan so duoc nhap: "+tuso+"/"+mauso);
        System.out.print("Phan so sau khi rut gon: ");
        RutGon(tuso, mauso);
    }
}
