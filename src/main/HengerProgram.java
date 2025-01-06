/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author vivcs
 */
import modell.Cso;
import modell.Henger;
import modell.TomorHenger;
import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<Henger> hengerek = new ArrayList<>();

    public HengerProgram() {
        hengerek.add(new TomorHenger(3.1, 5.2, 2.5));
        hengerek.add(new Cso(4, 6, 1.0, 0.5));
        hengerek.add(new TomorHenger(2, 4));
        hengerek.add(new Cso(5, 7, 0.8));
    }

    public double atlagTerfogat() {
        double osszTerfogat = 0;
        for (Henger h : hengerek) {
            osszTerfogat += h.terfogat();
        }
        return osszTerfogat / hengerek.size();
    }

    public double csovekSulya() {
        double osszSuly = 0;
        for (Henger h : hengerek) {
            if (h instanceof Cso) {
                osszSuly += ((TomorHenger) h).suly();
            }
        }
        return osszSuly;
    }

   public List<Henger> lista() {
    return new ArrayList<>(hengerek);
}


    public void run() {
        System.out.println("Átlagos térfogat: " + atlagTerfogat());
        System.out.println("Csövek összsúlya: " + csovekSulya());
        System.out.println("Hengerek: "+lista().toString());
    }

    public static void main(String[] args) {
        HengerProgram program = new HengerProgram();
        program.run();
    }
}
