package com.company;
import java.util.*;
public class Main {
    static Scanner in=new Scanner(System.in);
    static int count=0;
    static void input(int arr[] ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukan Bilangan Ke-" + (i + 1) + " : ");
            arr[i] = in.nextInt();
            count++;
        }
    }
    static void lihat(int arr[]){
        System.out.print("List : ");
        for (int i = 0; i <count; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void hapus(int arr[],int idx){
        for (int i = idx; i<count; i++) {
            arr[i] = arr[i+1];
        }
        count--;
    }
    public static void main(String[] args) {
        System.out.print("Masukan Jumlah Bilangan : ");
        int jml=in.nextInt();
        int bil[]=new int[jml];
	    input(bil);
        int index = 0;

        for (int i = 0; i < bil.length; i++) {
            for (int j = i + 1; j < bil.length; j++) {
                if (bil[i]==bil[j]) {
                    index=i;
                    hapus(bil,index);
                }
            }
        }
        lihat(bil);
    }
}
