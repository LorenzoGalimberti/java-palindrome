package org.java.lessons;

public class SommaMedia {
    public static void main(String[] args) {
        //Calcola la somma e la media dei primi 10 numeri.
        //variabili
        int somma=0;
        for (int i = 1; i <=10 ; i++) {
            somma+=i;

        }

        double media = (double) somma /10;
        System.out.println("Media: " + media);
    }
}
