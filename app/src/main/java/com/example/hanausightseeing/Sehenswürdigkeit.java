package com.example.hanausightseeing;

public class Sehenswürdigkeit {

    public String name;
    public String beschreibung;
    public int foto;

    public Sehenswürdigkeit(String name, String beschreibung, int foto) {
        this.beschreibung = beschreibung;
        this.name = name;
        this.foto = foto;
    }
}