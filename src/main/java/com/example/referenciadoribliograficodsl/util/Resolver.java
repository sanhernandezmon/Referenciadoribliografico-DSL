package com.example.referenciadoribliograficodsl.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.referenciadoribliograficodsl.Entity.Citation;
import com.example.referenciadoribliograficodsl.Entity.CitationType;
import com.example.referenciadoribliograficodsl.Entity.Lenguaje;
import com.example.referenciadoribliograficodsl.Entity.NotFoundDate;

public class Resolver {


    public String resolveDateBook(Date date, Lenguaje lenguaje){
        if(date== null){
            if (lenguaje == Lenguaje.ENGLISH){
                return NotFoundDate.nd.toString();
            }else{
                return NotFoundDate.sf.toString();
            }
        }else{
            String pattern = "yyyy";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            return format.format(date);
        }
    }

    public String resolveDateWebsite(Date date, Lenguaje lenguaje){
        if(date== null){
            if (lenguaje == Lenguaje.ENGLISH){
                return NotFoundDate.nd.toString();
            }else{
                return NotFoundDate.sf.toString();
            }
        }else{
            DateFormat format = DateFormat.getDateInstance();
            return format.format(date);
        }
    }

    public String resolveDateArticle(Date date, Lenguaje lenguaje){
        if(date== null){
            if (lenguaje == Lenguaje.ENGLISH){
                return NotFoundDate.nd.toString();
            }else{
                return NotFoundDate.sf.toString();
            }
        }else{
            String pattern = "yyyy - MMM";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            return format.format(date);
        }
    }
    public String resolveAuthorName(String AuthorName){
        List<String> names = List.of(AuthorName.split(" "));
        List<Character> initials = new ArrayList<>();
        StringBuilder result = new StringBuilder(" ");
        if(names.size()>1){
            for (String name:AuthorName.split(" ")) {
                initials.add(name.charAt(0));
            }
        }else{
            initials.add(AuthorName.charAt(0));
        }

        for (Character initial : initials) {
            result.append(initial).append(". ");
        }
        return result.toString();
    }


    public String citateEnglishBook(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateBook(citation.getPublicationDate(), Lenguaje.ENGLISH)+ ") " +
                citation.getTitle() + " , " + citation.getEditorial();
    }

    public String citateEnglishWebsite(Citation citation){
        if(citation.getWebSite()==null){
            return "please fill the website fields";
        }
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateWebsite(citation.getConsultDate(), Lenguaje.ENGLISH)+ ") " +
                citation.getTitle() + " , " + citation.getWebSite().getName() + " , " + citation.getWebSite().getUrl();
    }

    public String citateEnglishArticle(Citation citation){
        if(citation.getArticulo()==null){
            return "please fill the article fields";
        }
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateArticle(citation.getPublicationDate(), Lenguaje.ENGLISH)+ ") " +
                citation.getTitle() + " , " + citation.getArticulo().getPaperName() + " (" +
                citation.getArticulo().getVolumen() + ") " + citation.getArticulo().getPaginas();
    }

    public String citateSpanishBook(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateBook(citation.getPublicationDate(), Lenguaje.SPANISH)+ ") " +
                citation.getTitle() + " , " + citation.getEditorial();
    }

    public String citateSpanishWebsite(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateWebsite(citation.getConsultDate(), Lenguaje.SPANISH)+ ") " +
                citation.getTitle() + " , " + citation.getWebSite().getName() + " , " + citation.getWebSite().getUrl();
    }

    public String citateSpanishArticle(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateArticle(citation.getPublicationDate(), Lenguaje.SPANISH)+ ") " +
                citation.getTitle() + " , " + citation.getArticulo().getPaperName() + " (" +
                citation.getArticulo().getVolumen() + ") " + citation.getArticulo().getPaginas();
    }

    public CitationType resolveCitationType(String type){
        switch (type){
            case "book":
                return CitationType.book;
            case "article":
                return CitationType.article;
            case "website":
                return CitationType.website;
        }
        return null;
    }


}
