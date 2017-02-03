package rs.aleph.android.example12.activities;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by va on 2/3/2017.
 */

public class Kategorijama {

    private int id;
    private String name;
    private List<Jelo> jeloList;

    public Kategorijama() {
       jeloList=new ArrayList<>();
    }

    public Kategorijama(int id, String name) {
        this.id = id;
        this.name = name;
        jeloList=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Jelo> getJeloList() {
        return jeloList;
    }

    public void setJeloList(List<Jelo> jeloList) {
        this.jeloList = jeloList;
    }
}
