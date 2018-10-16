package com.company;

//import org.jetbrains.annotations.Contract;
//import java.lang.*;
import java.util.Scanner;

public class rpr_t1_z2 {

    public static void main(String[] args) {
        print("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        int broj=SumaCifara(n);
        for(int i=1;i<=n;i++){
            if(DaLiJe(broj,i)== true) print(i);
        }
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static void print(int text){
        System.out.println(text);
    }
    public  static int SumaCifara(int broj){
        int suma=0;
        int cifra=0;
        while(broj!=0){
            cifra=broj%10;
            suma+=cifra;
            broj/=10;
        }
        return suma;
    }

    public static boolean DaLiJe(int broj1, int broj2){
        if( broj1%broj2==0) return true;
        if( broj2%broj1==0) return true;
        return false;
    }

}