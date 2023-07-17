package org.java.lessons;

import java.util.Scanner;

//Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero.
public class SnackEight {
    public static void main(String[] args) {
        //variabili necessarie
        int numericValue;
        int somma=0;
        //prendi il numero
        Scanner scanner=new Scanner(System.in);
        System.out.print(" inserisci il numero");
        String numero=scanner.nextLine();

        // trasformalo in array

        char[] numeroArray = numero.toCharArray();


        //valuta l' array
        for (int i = 0; i <numeroArray.length ; i++) {
            numericValue = Integer.parseInt(String.valueOf(numeroArray[i]));
            somma+=numericValue;
        }
           // stampa
        System.out.println(somma);
    }
}
