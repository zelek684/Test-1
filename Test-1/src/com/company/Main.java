package com.company;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;
import java.lang.StringBuffer;



        public class Main {

            public static void showPrimes(int[] dane)
            {
                for(int i=0; i<dane.length;i++){
                    boolean prime = true;
                    for(int x=2;x<dane[i];x++)
                        if(dane[i]%x ==0)
                            prime =false;
                    if(prime) System.out.println(dane[i]);
                }
            }
            public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int[] tablica = new int[n];
                for(int i=0;i<n;i++){
                    tablica[i] = scanner.nextInt();
                }
                System.out.println("");
                showPrimes(tablica);
            }

        }



