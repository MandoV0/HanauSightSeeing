package com.example.hanausightseeing;

import java.io.Serializable;

public class Sehenswürdigkeit implements Serializable {

    public String name;
    public String beschreibung;
    public int[] fotos;

    public Sehenswürdigkeit(String name, String beschreibung, int[] fotos) {
        this.beschreibung = beschreibung;
        this.name = name;
        this.fotos = fotos;
    }

    public Sehenswürdigkeit(String name, String beschreibung, int foto) {
        this.beschreibung = beschreibung;
        this.name = name;
        fotos = new int[1];
        fotos[0] = foto;
    }
}