package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double aFiyat = 2.14, eFiyat = 3.67, dFiyat = 1.11, mFiyat = 0.95, pFiyat = 5;
        double aKilo, eKilo, dKilo, mKilo, pKilo;

        Scanner mana = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? ");
        aKilo = mana.nextDouble();

        System.out.print("Elma Kaç Kilo? ");
        eKilo = mana.nextDouble();

        System.out.print("Domates Kaç Kilo? ");
        dKilo = mana.nextDouble();

        System.out.print("Muz Kaç Kilo? ");
        mKilo = mana.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? ");
        pKilo = mana.nextDouble();

        double toplamTutar = aKilo * aFiyat + eFiyat * eKilo + dFiyat * dKilo + mFiyat * mKilo + pKilo * pFiyat ;
        System.out.println("Toplam Tutar : " + toplamTutar);

    }
}