package rs.aleph.android.example12.activities;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by va on 2/3/2017.
 */

public class Sastojci  {

    private int id;
    private String sastojak;

    private List<Jelo> jeloList;
    public Sastojci(int id, String sastojak,Jelo jelo) {
        this.id = id;
        this.sastojak = sastojak;
        jeloList=new ArrayList<>();

    }

    public Sastojci() {

        jeloList=new ArrayList<>();

    }










}
