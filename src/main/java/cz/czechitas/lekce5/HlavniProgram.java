package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Osoba;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {


        Osoba osoba1 = new Osoba();
        osoba1.setJmeno("Eva");
        osoba1.setPrijmeni("Černá");
        osoba1.setRodneCislo("ksdfg aksdg");

        Osoba osoba2 = new Osoba();
        osoba2.setJmeno("");
        osoba2.setPrijmeni("Novák");

        System.out.println(osoba1);
        System.out.println("Jméno první osoby: " + osoba1.getJmeno());
        System.out.println(osoba2);

    }

}
