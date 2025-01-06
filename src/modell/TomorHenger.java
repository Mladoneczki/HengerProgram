/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author vivcs
 */
public class TomorHenger extends Henger {
    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = 1.0; 
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        return "TomorHenger: sugar=" + getSugar() + ", magassag=" + getMagassag() + ", fajsuly=" + fajsuly+";";
    }
}
