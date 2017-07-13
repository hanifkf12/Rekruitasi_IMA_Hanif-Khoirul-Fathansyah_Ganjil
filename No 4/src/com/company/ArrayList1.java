package com.company;
import java.util.*;

/**
 * Created by hanifkf on 12/07/2017.
 */
public class ArrayList1 {



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> bil=new ArrayList();
        System.out.print("Masukan Jumlah Bilangan : ");
        int jml=in.nextInt();
        int angka;
        for(int i=0;i<jml;i++){
            System.out.print("Masukan Angka "+(i+1)+" :");
            angka=in.nextInt();
            bil.add(angka);
        }
        System.out.println("Sebelum dihapus : ");
        for(Object agk : bil){
            System.out.println(agk+" ");
        }

        System.out.println("Setelah dihapus : ");
        for (int i = 0; i < bil.size(); i++) {
            for (int j = i + 1; j < bil.size(); j++) {
                if (bil.get(i)==bil.get(j)) {
                    bil.remove(i);
                }
            }
        }
        for(Object agk : bil){
            System.out.print(agk+" ");
        }
    }
}
