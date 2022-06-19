package com.example.referenciadoribliograficodsl.util;

import java.util.Date;
import java.util.List;

import com.example.referenciadoribliograficodsl.Entity.Citation;
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
            return  String.valueOf(date.getYear()) ;
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
            return date.getDate() +  date.getMonth() + String.valueOf(date.getYear()) ;
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
            return date.getYear() + ", " + date.getMonth() ;
        }
    }
    public String resolveAuthorName(String AuthorName){
        List<String> names = List.of(AuthorName.split(" "));
        List<Character> initials = List.of();
        String result = "";
        if(names.size()<1){
            for (String name:AuthorName.split(" ")) {
                initials.add(name.charAt(0));
            }
        }else{
            initials.add(AuthorName.charAt(0));
        }
        for (Character initial : initials) {
            result.concat(initial + ". ");
        }
        return result;
    }


    public String citateEnglishBook(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateBook(citation.getPublicationDate(), Lenguaje.ENGLISH)+ ") " +
                citation.getTitle() + " " + citation.getEditorial();
    }

    public String citateEnglishWebsite(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateWebsite(citation.getConsultDate(), Lenguaje.ENGLISH)+ ") " +
                citation.getTitle() + " " + citation.getWebSite().getName() + " " + citation.getWebSite().getUrl();
    }

    public String citateEnglishArticle(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateArticle(citation.getConsultDate(), Lenguaje.ENGLISH)+ ") " +
                citation.getTitle() + " " + citation.getArticulo().getPaperName() + " (" +
                citation.getArticulo().getVolumen() + ") " + citation.getArticulo().getPaginas();
    }

    public String citateSpanishBook(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateBook(citation.getPublicationDate(), Lenguaje.SPANISH)+ ") " +
                citation.getTitle() + " " + citation.getEditorial();
    }

    public String citateSpanishWebsite(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateWebsite(citation.getConsultDate(), Lenguaje.SPANISH)+ ") " +
                citation.getTitle() + " " + citation.getWebSite().getName() + " " + citation.getWebSite().getUrl();
    }

    public String citateSpanishArticle(Citation citation){
        return citation.getAuthorLastName() + " , " + resolveAuthorName(citation.getAuthorName()) +
                "(" + resolveDateArticle(citation.getConsultDate(), Lenguaje.SPANISH)+ ") " +
                citation.getTitle() + " " + citation.getArticulo().getPaperName() + " (" +
                citation.getArticulo().getVolumen() + ") " + citation.getArticulo().getPaginas();
    }


}
