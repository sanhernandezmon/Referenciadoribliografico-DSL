package com.example.referenciadoribliograficodsl.Service;

import java.util.Comparator;

import com.example.referenciadoribliograficodsl.Entity.Citation;

public class CitationByLastNameComparer implements Comparator<Citation> {

    @Override public int compare(Citation x, Citation y) {
        return x.getAuthorLastName().compareToIgnoreCase(y.getAuthorLastName());
    }

}
