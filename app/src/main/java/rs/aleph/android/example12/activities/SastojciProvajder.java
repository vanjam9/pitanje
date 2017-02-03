package rs.aleph.android.example12.activities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by va on 2/3/2017.
 */

public class SastojciProvajder {

    public static List<Sastojci> getSastojke() {

        Jelo Jastog = new Jelo(0,"apples.jpg", "Jastog","opis","sastojci",7,88);
        Jelo Bananas = new Jelo(1,  "bananas.jpg", "Bananas","opis","sastojci",8,55);
        Jelo Burito = new Jelo(2,"oranges.jpg", "Burito", "opis","sastojci",44,677  );

        List<Sastojci> sastojciList = new ArrayList<>();
        sastojciList.add(new Sastojci(0,"morski pld" , Jastog));
       // sastojciList.add(new Sastojci(0,"majonez" , Jastog));
        sastojciList.add(new Sastojci(1,"secer" , Bananas));
        sastojciList.add(new Sastojci(2,"cili" , Burito));
        return sastojciList;
    }

    public static List<String> getSastojciNames() {

        List<String> names = new ArrayList<>();
        names.add("morski pld");
        names.add("secer");
        names.add("cili");
        return names;
    }

    public static Sastojci SastojciById(int id) {
        Jelo Jastog = new Jelo(0,"apples.jpg", "Jastog","opis","sastojci",7,88);
        Jelo Bananas = new Jelo(1,  "bananas.jpg", "Bananas","opis","sastojci",8,55);
        Jelo Burito = new Jelo(2,"oranges.jpg", "Burito", "opis","sastojci",44,677 );

        switch (id) {
            case 0:
                return new Sastojci(0,"morski pld" , Jastog);

            case 1:
                return new Sastojci(0,"secer" , Bananas);
            case 2:
                return new Sastojci(0,"cili" , Burito);
            default:
                return null;
        }
    }





























}
