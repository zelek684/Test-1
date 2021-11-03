package com.company;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;
import java.lang.StringBuffer;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int n = scan.nextInt();
        int[] tablica = new int[n];
        for(int i=0;i<n;i++){
            tablica[i] = ran.nextInt(50)-50;
            System.out.print(tablica[i]+" ");
        }
        System.out.println("");
        int maxymalna=-51;
        for(int i=0;i<tablica.length;i++)
            if(maxymalna<tablica[i]) maxymalna=tablica[i];
        System.out.println(maxymalna);
        int licz =0;
        for(int i=0;i<tablica.length;i++)
            if(maxymalna==tablica[i]) licz++;
        System.out.println(licz);
    }
}
