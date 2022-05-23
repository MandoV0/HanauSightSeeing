package com.example.hanausightseeing.models;

import com.example.hanausightseeing.R;
import com.example.hanausightseeing.Sehenswürdigkeit;

import java.util.ArrayList;
import java.util.Arrays;

public class Model {

    private final ArrayList<Sehenswürdigkeit> sehenswürdigkeitList =
            new ArrayList<Sehenswürdigkeit>(Arrays.asList(
                    new Sehenswürdigkeit("Goldschmiede", "Die Goldschmiede wurde 1990 gebaut", new int[] {R.drawable.goldschmiede, R.drawable.goldi2}, "https://goo.gl/maps/fpMe5FugRSzomhP67" ),
                    new Sehenswürdigkeit("Schloss", "Das Schloss der Märchen", R.drawable.schloss, "https://goo.gl/maps/VAg1w4495Wu94so56"),
                    new Sehenswürdigkeit("Brüder-Grimm-Nationaldenkmal", "Das Brüder-Grimm-Nationaldenkmal ist eine Doppelstatue für die in Hanau geborenen Brüder Grimm. Sie wurde 1896 vor dem Neustädter Rathaus in Hanau enthüllt. ", R.drawable.grimm, "https://goo.gl/maps/M5Z9Fukcs4G1broc6"),
                    new Sehenswürdigkeit("Wilhelmsbad", "Wilhelmsbad gehört zu den beliebtesten Naherholungszielen im Rhein-Main-Gebiet. " +
                    "Keiner der vielen Stammgäste mag sich festlegen, zu welcher Jahreszeit die Anlage mit " +
                    "ihrem prächtigen Baumbestand und der langgestreckten Reihe historischer Kurgebäude" +
                    " am reizvollsten ist. Ihre Entstehung verdankt die historische Kur- und Badeanlage zwei Kräuterfrauen," +
                            " die hier im Jahre 1709 eine Waldquelle entdeckten, der wenig später heilsame Wirkung zugesagt wurde.", R.drawable.wilhelmsbad, "https://goo.gl/maps/Ef6a9iFe3fFAStB28"),
                    new Sehenswürdigkeit("Die Evangelische Marienkirche", "Die Evangelische Marienkirche - ein Schmuckstück im Herzen der Hanauer Altstadt. 1234 durch Urkunde des Grafen Reinhard zu Hanau - Münzenberg gegründet,\n" +
                    "1316 als Bauwerk erstmals in einem Ablassbrief des Erzbischofs von Mainz erwähnt.", R.drawable.marienkirche, ""),
                    new Sehenswürdigkeit("Alte Fasanerie", "Der Wildpark Alte Fasanerie ist ein Wildgehege bei Klein-Auheim, einem Stadtteil von Hanau. Die Anlage ist 107 Hektar groß und beherbergt rund 40 mittel- und nordeuropäische Tierarten mit gut 350 Exemplaren. Das Gehege geht auf eine 1705 von Erzbischof Lothar Franz von Schönborn geschaffene Fasanerie zurück. Der Park ist heute ein beliebtes Naherholungsziel für Menschen aus dem ganzen Rhein-Main-Gebiet.", R.drawable.alte_fasanerie, "https://goo.gl/maps/A9YwBuU76matki6E6"),
                    new Sehenswürdigkeit("Wallonisch-Niederländische Kirche", "Die Wallonisch-Niederländische Kirche in Hanau war die Doppelkirche reformierter Konfession der durch Graf Philipp Ludwig II. von Hanau-Münzenberg für Religionsflüchtlinge aus Frankreich und den spanischen Niederlanden gegründeten Neustadt Hanau", R.drawable.kirche, "https://goo.gl/maps/UacqFGVJ3FhmMYC29"),
                    new Sehenswürdigkeit("Amphitheater", "Zum so genannten Amphitheater Hanau wurde, im Zuge der Landesgartenschau 2002 in Hanau, der ehemalige Baumgarten, das westliche Ende des Schlossparks des Schlosses Philippsruhe, umgebaut. Jedes Jahr werden dort von Anfang Mai bis Ende Juli die Brüder Grimm Festspiele veranstaltet", R.drawable.theater, "https://goo.gl/maps/jfpuRYS9esEySXtA8")

            ));

    /**
     * Gibt eine Liste mit allen Sehenswürdigkeiten zurück
     */
    public ArrayList<Sehenswürdigkeit> getSehenswürdigkeiten() { return sehenswürdigkeitList; }
}