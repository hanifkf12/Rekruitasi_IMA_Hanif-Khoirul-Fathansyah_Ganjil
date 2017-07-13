package com.company;
import java.util.*;

public class Main {
    static void insertion(int arr[]){
        int temp;
        int n=arr.length;
        for(int t=1;t<n;t++){
            temp=arr[t];
            int i=t-1;
            while((i>=0) && arr[i]>temp){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Masukan Jumlah Bilangan : ");
        int jml=in.nextInt();
        int bil[]= new int[jml];
        for(int i=0;i<jml;i++){
            System.out.print("Masukan Bilangan Ke-"+(i+1)+" : ");
            bil[i]=in.nextInt();
        }
        System.out.println("Sebelum Diurutkan : ");
        for(int a=0;a<jml;a++){
            System.out.print(bil[a]+" ");
        }
        System.out.println();
        insertion(bil);
        System.out.println("Setelah Diurutkan : ");
        for(int a=0;a<jml;a++){
            System.out.print(bil[a]+" ");
        }
    }
}
