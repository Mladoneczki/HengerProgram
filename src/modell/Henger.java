/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author vivcs
 */
public class Henger {
    private static int hengerDarab = 0;
    private double sugar;
    private double magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDarab++;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat() {
        return Math.PI * sugar * sugar * magassag;
    }

    @Override
    public String toString() {
        return "Henger: sugar=" + sugar + ", magassag=" + magassag+";";
    }
}

