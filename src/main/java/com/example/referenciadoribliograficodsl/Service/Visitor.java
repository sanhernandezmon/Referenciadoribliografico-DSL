package com.example.referenciadoribliograficodsl.Service;

import java.util.*;

import Gen.citatorBaseVisitor;
import Gen.citatorParser;
import com.example.referenciadoribliograficodsl.Entity.*;
import com.example.referenciadoribliograficodsl.util.Resolver;

public class Visitor<T> extends citatorBaseVisitor<T> {
    List<Citation> citations = new ArrayList<>();
    Bibliography bibliography = new Bibliography(Lenguaje.SPANISH ,citations);

    Resolver resolver = new Resolver();

    @Override public T visitReference(citatorParser.ReferenceContext ctx) {
        Lenguaje lenguaje = (Lenguaje) visitLenguaje(ctx.lenguaje());
        bibliography.setLenguaje(lenguaje);
        if (ctx.citations()!= null){
            visitCitations(ctx.citations());
        }
        System.out.println(bibliography.getCitations());
        return null;
    }

    @Override public T visitLenguaje(citatorParser.LenguajeContext ctx) {
        if (ctx.LENGUAJEOPTION().getText().equals("ENGLISH")){
            return (T) Lenguaje.ENGLISH;
        }else{
            return (T) Lenguaje.SPANISH;
        }
    }

    @Override public T visitCitations(citatorParser.CitationsContext ctx) {
        if (ctx.citation()!=null){
            Citation citation = (Citation) visitCitation(ctx.citation());
            citations.add(citation);
        }
        if (ctx.citations()!= null){
            visitCitations(ctx.citations());
        }
        return null;
    }

    @Override public T visitCitation(citatorParser.CitationContext ctx) {
        Citation citation = new Citation();
        citation.setAuthorName((String) visitAuthorName(ctx.authorName()));
        citation.setAuthorLastName((String) visitAuthorLastName(ctx.authorLastName()));
        citation.setCitationType(resolver.resolveCitationType((String) visitCitationType(ctx.citationType())) );
        if (ctx.publicationDate()!= null){
            citation.setPublicationDate((Date) visitPublicationDate(ctx.publicationDate()));
        }
        if(ctx.consultDate()!= null){
            citation.setConsultDate((Date) visitConsultDate(ctx.consultDate()));
        }
        if (ctx.citationTitle()!= null){
            citation.setTitle((String) visitCitationTitle(ctx.citationTitle()));
        }
        if (ctx.city()!= null){
            citation.setCity((String) visitCity(ctx.city()));
        }
        if (ctx.editorial()!= null){
            citation.setEditorial((String) visitEditorial(ctx.editorial()));
        }
        if (ctx.website()!= null){
            citation.setWebSite((WebSite) visitWebsite(ctx.website()));
        }
        if (ctx.article()!= null){
            citation.setArticulo((Articulo) visitArticle(ctx.article()));
        }
        return (T) citation;
    }

    @Override public T visitAuthorName(citatorParser.AuthorNameContext ctx) {
        String name = ctx.ID(0).getText();
        if (ctx.ID(1)!= null){
            name =  name.concat(" " + ctx.ID(1).getText()) ;
        }
        return (T) name;
    }

    @Override public T visitAuthorLastName(citatorParser.AuthorLastNameContext ctx) {
        String lastName = ctx.ID(0).getText();
        if (ctx.ID(1)!= null){
            lastName =  lastName.concat(" " + ctx.ID(1).getText()) ;
        }
        return (T) lastName;
    }

    @Override public T visitCitationTitle(citatorParser.CitationTitleContext ctx) {
        return (T) ctx.STRING().getText().substring(1,ctx.STRING().getText().length()-1);
    }

    @Override public T visitPublicationDate(citatorParser.PublicationDateContext ctx) {
        return (T) visitDate(ctx.date());
    }

    @Override public T visitConsultDate(citatorParser.ConsultDateContext ctx) {
        return (T) visitDate(ctx.date());
    }

    @Override public T visitCitationType(citatorParser.CitationTypeContext ctx) {
        return (T) ctx.CITATIONTYPE().getText();
    }

    @Override public T visitDate(citatorParser.DateContext ctx) {
        Integer year = Integer.valueOf(ctx.YEAR().getText());
        Integer month = (Integer) visitMonth(ctx.month());
        Integer day = Integer.valueOf(ctx.DAY().getText());
        Date date = new GregorianCalendar(year, month - 1, day).getTime();


        return (T)date;
    }

    @Override public T visitMonth(citatorParser.MonthContext ctx) {
        if (ctx.JAN() != null){
            return (T) Integer.valueOf(1);
        }
        if (ctx.FEB() != null){
            return (T) Integer.valueOf(1);
        }
        if (ctx.MAR() != null){
            return (T) Integer.valueOf(3);
        }
        if (ctx.APR() != null){
            return (T) Integer.valueOf(4);
        }
        if (ctx.MAY() != null){
            return (T) Integer.valueOf(5);
        }
        if (ctx.JUN() != null){
            return (T) Integer.valueOf(6);
        }
        if (ctx.JUL() != null){
            return (T) Integer.valueOf(7);
        }
        if (ctx.AUG() != null){
            return (T) Integer.valueOf(8);
        }
        if (ctx.SEP() != null){
            return (T) Integer.valueOf(9);
        }
        if (ctx.OCT() != null){
            return (T) Integer.valueOf(10);
        }
        if (ctx.NOV() != null){
            return (T) Integer.valueOf(11);
        }
        if (ctx.DEC() != null){
            return (T) Integer.valueOf(12);
        }
        return (T) Integer.valueOf(0);
    }

    @Override public T visitCity(citatorParser.CityContext ctx) {
        return (T) ctx.ID().getText();
    }

    @Override public T visitEditorial(citatorParser.EditorialContext ctx) {
        return (T) ctx.STRING().getText().substring(1,ctx.STRING().getText().length()-1);
    }

    @Override public T visitWebsite(citatorParser.WebsiteContext ctx) {
        return (T) new WebSite(ctx.STRING(0).getText().substring(1,ctx.STRING(0).getText().length()-1), ctx.STRING(1).getText().substring(1,ctx.STRING(1).getText().length()-1));
    }

    @Override public T visitArticle(citatorParser.ArticleContext ctx) {
        return (T) new Articulo(ctx.STRING().getText().substring(1,ctx.STRING().getText().length()-1),Integer.parseInt(ctx.VOLUMEN()
                .getText()),ctx.PAGINAS().getText());
    }
}
