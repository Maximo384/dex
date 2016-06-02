package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;
import java.util.Random;

/**
 * Classe Main del joc del penjat
 */
public class Main extends nova {

    /**
     * Methode main que genera un numero aleatori entre l'1 i el 3 per a escollir una paraula del vector paraules, inicialitza totes les p amb un "_" y despres mostra per pantalla la p
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Comença el joc!");

        Random rand = new Random();
        index = rand.nextInt(3);
        for (int i = 0; i< Longitut; i++) {
            p += "_";
        }

        System.out.println(p);

        Scanner reader = new Scanner(System.in);

        int num_errors = 0;

        while (!p.equals(paraules[index]) && num_errors < 5) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(p);
        }
    }

}

