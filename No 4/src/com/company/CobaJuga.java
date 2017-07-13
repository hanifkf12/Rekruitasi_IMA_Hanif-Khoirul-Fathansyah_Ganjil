package com.company;
import java.util.*;
/**
 * Created by hanifkf on 12/07/2017.
 */
public class CobaJuga {
    static Scanner in=new Scanner(System.in);
    static int count=0;
    static void input(int arr[] ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukan Bilangan Ke-" + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }

    }
    static void lihat(int arr[]){
        System.out.print("List : ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("Masukan Jumlah Bilangan : ");
        int jml=in.nextInt();
        int bil[]=new int[jml];
        input(bil);
        int index = 0;

        lihat(bil);
        System.out.println();

        for (int i = 0; i < bil.length; i++) {
            for (int j = i + 1; j < bil.length; j++) {
                if (bil[i]==bil[j]) {
                    count++;
                }
            }
        }
        int[] baru=new int[jml-count];

        for (int i = 0; i < bil.length; i++) {
            for (int j = i + 1; j < bil.length; j++) {
                if (bil[i]==bil[j]) {
                    index=i;
                    for (int x = 0; x < index; x++) {
                        baru[x] = bil[x];
                    }
                    for (int y = index + 1; y < bil.length; y++) {
                        baru[y - 1] = bil[y];
                    }

                }
            }
        }

        for (int z = 0; z < baru.length; z++) {
            System.out.print(baru[z]+" ");
        }

    }
}
