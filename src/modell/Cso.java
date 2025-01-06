/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import modell.TomorHenger;

/**
 *
 * @author vivcs
 */
public class Cso extends TomorHenger {
    private double falvastagsag;

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double falvastagsag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        double belsoSugar = getSugar() - falvastagsag;
        return Math.PI * (getSugar() * getSugar() - belsoSugar * belsoSugar) * getMagassag();
    }

    @Override
    public String toString() {
        return "Cso: sugar=" + getSugar() + ", magassag=" + getMagassag() +
               ", fajsuly=" + getFajsuly() + ", falvastagsag=" + falvastagsag+";";
    }
}


