package org.java.lessons;

import java.util.Scanner;

public class JavaPalindrome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //variabile flag
        boolean flag=true;
        //inserisci la prima parola
        System.out.print("inserisci la prima parola : ");
        String parola= scanner.nextLine();
        // trasformo la stringa in un array
        char[] parolaArray = parola.toCharArray();
        int l=parolaArray.length;
        // controllo palindrome -->o pari o dispari
        if(l%2==0){
            // se pari ciclo dalla posizione 0 alla metà -1
            for (int i = 0; i < (l/2)-1; i++) {
                if(parolaArray[i]!=parolaArray[l-i-1]){
                    flag=false;
                }
            }
        }else {
            // se dispari dalla posizione 0 alle (lunghezza -1)/2 -1
            for (int i = 0; i < ((l-1)/2)-1; i++) {
                if(parolaArray[i]!=parolaArray[l-i-1]){
                    flag=false;
                }
            }
        }




        // stampa risultati
        if(flag){
            System.out.println(parola+" è palindroma!!");
        }else {
            System.out.println(parola+" non è palindroma!!");
        }


     }
}
