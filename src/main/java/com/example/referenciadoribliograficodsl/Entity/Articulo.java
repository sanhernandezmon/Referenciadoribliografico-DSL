package com.example.referenciadoribliograficodsl.Entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Articulo {

    private String paperName;
    private int volumen;
    private String Paginas;

    public String getPaperName() {
        return paperName;
    }

    public int getVolumen() {
        return volumen;
    }

    public String getPaginas() {
        return Paginas;
    }
}
