package com.company;
import java.util.*;
public class Main {
    String nama;
    int nomer,nilai;
    static int count=0;
    static Scanner in=new Scanner(System.in);
    static void urutnilai(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    static void juara(Main[] peserta, int n){
        int[] temp = new int[30];
        int a=0;
        while(peserta[a]!=null){
            temp[a]=peserta[a].nilai;
            a++;
        }
        urutnilai(temp);
        for (int x:temp) {
            for (int j = 0; j < n; j++) {
                if (x == peserta[j].nilai) {

                    System.out.println(peserta[j].nama);
                    System.out.println(peserta[j].nilai);
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j = i + 1; j < n; j++) {
                if (peserta[i].nilai==peserta[j].nilai) {
                    System.out.println("Juara "+i);
                    System.out.println(peserta[i].nama);
                    System.out.println(peserta[i].nilai);
                    System.out.println(peserta[j].nama);
                    System.out.println(peserta[j].nilai);
                }
                else if(peserta[i].nilai!=peserta[j].nilai){
                    System.out.println("Juara "+i);
                    System.out.println(peserta[i].nama);
                    System.out.println(peserta[i].nilai);
                }
            }

        }
    }
    public static void main(String[] args) {
        Main peserta[]=new Main[300];
        System.out.print("Masukan Jumlah Peserta : ");
        int jm=in.nextInt();
        int n=0;

        for(int i=0;i<jm;i++){
            System.out.println("Inputkan Data Peserta ");
            peserta[n]=new Main();
            System.out.print("Nomer : ");
            peserta[n].nomer=in.nextInt();
            if(peserta[n].nomer==9999){
                break;
            }
            System.out.print("Nama : ");
            peserta[n].nama=in.next();
            System.out.print("Nilai : ");
            peserta[n].nilai=in.nextInt();
            n++;
            count++;
        }
        juara(peserta,count);
    }
}
