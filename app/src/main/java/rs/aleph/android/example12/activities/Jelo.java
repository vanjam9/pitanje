package rs.aleph.android.example12.activities;

import android.app.Activity;

/**
 * Created by va on 2/1/2017.
 */

public class Jelo extends Activity {

    private int id;
    private String slika,ime,opis,kategorija,sastojci;
    private int kalorije;
     private double cena;


    public Jelo(String slika, String ime, String opis, String kategorija, String sastojci, int kalorije, double cena) {

        this.slika = slika;
        this.ime = ime;
        this.opis = opis;
        this.kategorija = kategorija;
        this.sastojci = sastojci;
        this.kalorije = kalorije;
        this.cena = cena;
    }

    public Jelo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getSastojci() {
        return sastojci;
    }

    public void setSastojci(String sastojci) {
        this.sastojci = sastojci;
    }

    public int getKalorije() {
        return kalorije;
    }

    public void setKalorije(int kalorije) {
        this.kalorije = kalorije;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
