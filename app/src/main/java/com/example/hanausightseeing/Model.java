package com.example.hanausightseeing;

import java.util.ArrayList;
import java.util.Arrays;

public class Model {
    private ArrayList<Sehenswürdigkeit> sehenswürdigkeitList = new ArrayList<Sehenswürdigkeit>(Arrays.asList( new Sehenswürdigkeit("Goldschmiede", "Die Goldschmiede wurde 1990 gebaut", R.drawable.goldschmiede), new Sehenswürdigkeit("Schloss", "Das Schloss der Märchen", R.drawable.schloss), new Sehenswürdigkeit("Brüder-Grimm-Nationaldenkmal", "Das Brüder-Grimm-Nationaldenkmal ist eine Doppelstatue für die in Hanau geborenen Brüder Grimm. Sie wurde 1896 vor dem Neustädter Rathaus in Hanau enthüllt. ", R.drawable.grimm) ));

    public ArrayList<Sehenswürdigkeit> getSehenswürdigkeiten() { return sehenswürdigkeitList; }
}
