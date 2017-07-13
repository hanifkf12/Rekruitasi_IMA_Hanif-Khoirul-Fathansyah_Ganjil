package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        String pal;
        System.out.print("Masukan Kata : ");
        pal =in.nextLine();
        int lt=pal.length();
        int a=0;
        for(int i=0;i<pal.length();i++){
            if(pal.charAt(i)==pal.charAt(lt-1)){
                a++;
                lt--;
            }
        }
        if(pal.length()==a){
            System.out.println("PALINDROM");
        }
        else {
            System.out.println("BUKAN PALINDROM");
        }
    }
}
