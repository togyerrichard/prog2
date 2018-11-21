/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F07;

/**
 *
 * @author Togyi
 */
public class Lakohaz implements Comparable<Lakohaz> {

    public final double emeletMagassag = 3.2;
    private String cím;
    private int emeletekSzáma;
    private double alapterület;

    public Lakohaz(String cím, int emeletekSzáma, double alapterület) {
        this.cím = cím;
        this.emeletekSzáma = emeletekSzáma;
        this.alapterület = alapterület;
    }

    public String getCím() {
        return cím;
    }

    public int getEmeletekSzáma() {
        return emeletekSzáma;
    }

    public double getAlapterület() {
        return alapterület;
    }

    public double légköbméter() {
        return this.alapterület * this.emeletMagassag * this.emeletekSzáma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cím).append("\n");
        sb.append(this.légköbméter());
        return sb.toString();
    }

    @Override
    public int compareTo(Lakohaz t) {
        return Double.compare(this.légköbméter(), t.légköbméter());
    }

}