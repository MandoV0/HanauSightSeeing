package com.example.hanausightseeing;

import java.io.Serializable;

public class Sehenswürdigkeit implements Serializable {

    public String name;
    public String beschreibung;
    public int[] fotos;
    public String mapLink;

    public Sehenswürdigkeit(String name, String beschreibung, int[] fotos, String mapLink) {
        this.beschreibung = beschreibung;
        this.name = name;
        this.fotos = fotos;
        this.mapLink = mapLink;
    }

    public Sehenswürdigkeit(String name, String beschreibung, int foto, String mapLink) {
        this.beschreibung = beschreibung;
        this.name = name;
        fotos = new int[1];
        fotos[0] = foto;
        this.mapLink = mapLink;
    }
}