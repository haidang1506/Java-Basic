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
public class Cong2MaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dang ma tran A(m*n): ");
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Nhap ma tran A: ");
        
        int[][] matranA = new int[m][n];
        //nhập ma trận A
        for (int i=0; i<m; i++){
            for (int j=0; j<n;j++){
                System.out.print("A["+(i+1)+"]"+"["+(j+1)+"]: ");
                matranA[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Nhap ma tran B: ");
        int[][] matranB = new int[m][n];
        //nhập ma trận B
        for (int i=0; i<m;i++){
            for (int j=0; j<n;j++){
                System.out.print("B["+(i+1)+"]"+"["+(j+1)+"]: ");
                matranB[i][j] = sc.nextInt();
            }
        }
        
        int[][] matranTong = new int[m][n];
        //tính ma trận tổng
        for (int i=0; i<m;i++){
            for (int j=0; j<n;j++){
                matranTong[i][j] = matranA[i][j] + matranB[i][j];
            }
        }
        
        System.out.println("Ma tran ket qua: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(matranTong[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
