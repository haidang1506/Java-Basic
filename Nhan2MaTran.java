/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan4_BaiTapMang2Chieu;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Nhan2MaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dang ma tran A(m*n): ");
        System.out.print("m = ");
        int mA = sc.nextInt();
        System.out.print("n = ");
        int nA = sc.nextInt();
        
        System.out.println("Nhap dang ma tran B(m*n): ");
        System.out.print("m = ");
        int mB = sc.nextInt();
        System.out.print("n = ");
        int nB = sc.nextInt();
        
        if (nA!=mB){//điều kiện để nhân 2 ma trận là nA = mB
            System.out.println("2 ma tran nay khong the nhan voi nhau");
        }
        else {
            int[][] matranA = new int[mA][nA];
            System.out.println("Nhap ma tran A:");
            for (int i =0; i<mA; i++){
                for (int j = 0; j<nA; j++){
                    System.out.print("A["+(i+1)+"]"+"["+(j+1)+"]: ");
                    matranA[i][j] = sc.nextInt();
                }
            }
            
            int[][] matranB = new int[mB][nB];
            System.out.println("Nhap ma tran B:");
            for (int i =0; i<mB; i++){
                for (int j = 0; j<nB; j++){
                    System.out.print("B["+(i+1)+"]"+"["+(j+1)+"]: ");
                    matranB[i][j] = sc.nextInt();
                }
            }
            
            int sum=0;
            for (int i=0; i<nA; i++){
                for (int j=0; j<mB; j++){
                    sum += matranA[mA][i]*matranB[j][nB];
                }
            }
            
            int[][] matranTich = new int[mA][nB];
            for (int i=0; i<mA; i++){
                for (int j =0; j<nB; j++){
                    //matranTich[i][j] = 
                }
            }
        }
    }
}
