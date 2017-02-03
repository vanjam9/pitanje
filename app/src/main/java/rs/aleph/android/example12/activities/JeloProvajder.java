package rs.aleph.android.example12.activities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by va on 2/3/2017.
 */

public class JeloProvajder {

    public static List<Jelo> getJelo() {

        Kategorijama SlanaJ = new Kategorijama(0, "SlanaJ");
        Kategorijama SlatkaJ = new Kategorijama(1, "SlatkaJ");
        Kategorijama LjutaJ = new Kategorijama(2, "LjutaJ");

        List<Jelo> jeloList = new ArrayList<>();
        jeloList.add(new Jelo(0, "apples.jpg", "Jastog","opis","sastojci",7,88, SlanaJ));
        jeloList.add(new Jelo(1, "bananas.jpg", "Bananas","opis","sastojci",8,55 , SlatkaJ));
        jeloList.add(new Jelo(2, "oranges.jpg", "Burito", "opis","sastojci",44,677 , LjutaJ));
        return jeloList;
    }

    public static List<String> getJelaNames() {

        List<String> names = new ArrayList<>();
        names.add("Jastog");
        names.add("Bananas");
        names.add("Burito");
        return names;
    }

    public static Jelo getJeloById(int id) {

        Kategorijama SlanaJ = new Kategorijama(0, "SlanaJ");
        Kategorijama SlatkaJ = new Kategorijama(1, "SlatkaJ");
        Kategorijama LjutaJ = new Kategorijama(2, "LjutaJ");

        switch (id) {
            case 0:
                return new Jelo(0, "apples.jpg", "Jastog","opis","sastojci",7,88, SlanaJ);
            case 1:
                return new Jelo(1, "bananas.jpg", "Bananas","opis","sastojci",8,55 , SlatkaJ);
            case 2:
                return new Jelo(2, "oranges.jpg", "Burito", "opis","sastojci",44,677 , LjutaJ);
            default:
                return null;
        }
    }



}
