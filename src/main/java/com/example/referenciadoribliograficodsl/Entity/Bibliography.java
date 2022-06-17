package com.example.referenciadoribliograficodsl.Entity;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.referenciadoribliograficodsl.Service.CitationByLastNameComparer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bibliography {

    private Lenguaje lenguaje;

    private List<Citation> citations;

    public void setLenguaje(Lenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }

    public Lenguaje getLenguaje() {
        return lenguaje;
    }

    public List<Citation> getCitations() {
        return citations;
    }

    private String getBibliographyTitle(){
        if (this.lenguaje.equals(Lenguaje.ENGLISH)){
            return "Bibliography";
        }else{
            return "Bibliografia";
        }
    }
    @Override public String toString() {
        citations.sort(new CitationByLastNameComparer());
        StringBuilder bibliography = new StringBuilder(getBibliographyTitle() + "\n");
        for (Citation citation:citations) {
            bibliography.append(citation.toString(this.lenguaje));
        }
        return bibliography.toString();
    }
}
