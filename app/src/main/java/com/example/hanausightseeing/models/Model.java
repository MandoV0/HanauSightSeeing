package com.example.hanausightseeing.models;

import com.example.hanausightseeing.R;
import com.example.hanausightseeing.Sehenswürdigkeit;

import java.util.ArrayList;
import java.util.Arrays;

public class Model {

    private ArrayList<Sehenswürdigkeit> sehenswürdigkeitList =
            new ArrayList<Sehenswürdigkeit>(Arrays.asList(
                    new Sehenswürdigkeit("Goldschmiede", "Die Goldschmiede wurde 1990 gebaut", new int[] {R.drawable.goldschmiede, R.drawable.goldi2} ),
                    new Sehenswürdigkeit("Schloss", "Das Schloss der Märchen", R.drawable.schloss),
                    new Sehenswürdigkeit("Brüder-Grimm-Nationaldenkmal", "Das Brüder-Grimm-Nationaldenkmal ist eine Doppelstatue für die in Hanau geborenen Brüder Grimm. Sie wurde 1896 vor dem Neustädter Rathaus in Hanau enthüllt. ", R.drawable.grimm),
                    new Sehenswürdigkeit("Wilhelmsbad", "Wilhelmsbad gehört zu den beliebtesten Naherholungszielen im Rhein-Main-Gebiet. " +
                    "Keiner der vielen Stammgäste mag sich festlegen, zu welcher Jahreszeit die Anlage mit " +
                    "ihrem prächtigen Baumbestand und der langgestreckten Reihe historischer Kurgebäude" +
                    " am reizvollsten ist. Ihre Entstehung verdankt die historische Kur- und Badeanlage zwei Kräuterfrauen," +
                    " die hier im Jahre 1709 eine Waldquelle entdeckten, der wenig später heilsame Wirkung zugesagt wurde.", R.drawable.wilhelmsbad),
                    new Sehenswürdigkeit("Die Evangelische Marienkirche", "Die Evangelische Marienkirche - ein Schmuckstück im Herzen der Hanauer Altstadt. 1234 durch Urkunde des Grafen Reinhard zu Hanau - Münzenberg gegründet,\n" +
                    "1316 als Bauwerk erstmals in einem Ablassbrief des Erzbischofs von Mainz erwähnt.", R.drawable.marienkirche)

            ));

    public ArrayList<Sehenswürdigkeit> getSehenswürdigkeiten() { return sehenswürdigkeitList; }
}