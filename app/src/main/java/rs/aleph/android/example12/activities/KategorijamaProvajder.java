package rs.aleph.android.example12.activities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by va on 2/3/2017.
 */

public class KategorijamaProvajder {

    public static List<Kategorijama> getKategorijama() {

        List<Kategorijama> kategorijamaList = new ArrayList<>();
        kategorijamaList.add(new Kategorijama(0, "Rose"));
        kategorijamaList.add(new Kategorijama(1, "Citrus"));
        kategorijamaList.add(new Kategorijama(2, "Berry"));
        return kategorijamaList;
    }

    public static List<String> getKategorijamaNames() {
        List<String> names = new ArrayList<>();
        names.add("SlanaJ");
        names.add("SlatkaJ");
        names.add("LjutaJ");
        return names;
    }

    public static Kategorijama getKategorijama(int id) {
        switch (id) {
            case 0:
                return new Kategorijama(0, "SlanaJ");
            case 1:
                return new Kategorijama(1, "SlatkaJ");
            case 2:
                return new Kategorijama(2, "LjutaJ");
            default:
                return null;
        }
    }

}
