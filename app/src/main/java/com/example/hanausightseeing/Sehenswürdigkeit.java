package com.example.hanausightseeing;

public class Sehenswürdigkeit {

    public String name;
    public String beschreibung;
    public String[] bilder;

    public Sehenswürdigkeit(String name, String beschreibung) {
        this.beschreibung = beschreibung;
        this.name = name;
    }
}