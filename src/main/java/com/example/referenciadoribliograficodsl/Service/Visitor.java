package com.example.referenciadoribliograficodsl.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import Gen.citatorBaseVisitor;
import Gen.citatorParser;
import com.example.referenciadoribliograficodsl.Entity.*;

public class Visitor<T> extends citatorBaseVisitor<T> {
    List<Citation> citations = List.of();
    Bibliography bibliography = new Bibliography(Lenguaje.SPANISH ,citations);

    @Override public T visitReference(citatorParser.ReferenceContext ctx) {
        Lenguaje lenguaje = (Lenguaje) visitLenguaje(ctx.lenguaje());
        bibliography.setLenguaje(lenguaje);
        visitCitations(ctx.citations());
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
        citation.setCitationType((CitationType) visitCitationType(ctx.citationType()));
        if (ctx.publicationDate()!= null){
            citation.setPublicationDate((Date) visitPublicationDate(ctx.publicationDate()));
        }
        if(ctx.consultDate()!= null){
            citation.setConsultDate((Date) visitConsultDate(ctx.consultDate()));
        }
        if (ctx.citationTitle()!= null){
            citation.setTitle((String) visitCitationTitle(ctx.citationTitle()));
        }
        if (ctx.resume()!= null){
            citation.setResume((String) visitResume(ctx.resume()));
        }
        return (T) citation;
    }

    @Override public T visitAuthorName(citatorParser.AuthorNameContext ctx) {
        return (T) ctx.AUTHORNAME().getText();
    }

    @Override public T visitAuthorLastName(citatorParser.AuthorLastNameContext ctx) {
        return (T) ctx.AUTHORLASTNAME().getText();
    }

    @Override public T visitCitationTitle(citatorParser.CitationTitleContext ctx) {
        return (T) ctx.TITLE().getText();
    }

    @Override public T visitPublicationDate(citatorParser.PublicationDateContext ctx) {
        Date date = (Date) visitDate(ctx.date());
        return (T) date;
    }

    @Override public T visitConsultDate(citatorParser.ConsultDateContext ctx) {
        Date date = (Date) visitDate(ctx.date());
        return (T) date;
    }

    @Override public T visitCitationType(citatorParser.CitationTypeContext ctx) {
        return (T) ctx.CITATIONTYPE().getText();
    }

    @Override public T visitResume(citatorParser.ResumeContext ctx) {
        return (T) ctx.RESUMETEXT();
    }

    @Override public T visitDate(citatorParser.DateContext ctx) {
        Date date = new Date();
        date.setYear(Integer.valueOf(ctx.YEAR().getText()));
        date.setDate(Integer.valueOf(ctx.DAY().getText()));
        if (ctx.MONTH()!= null){
            date.setMonth(Integer.valueOf(ctx.MONTH().getText()));
        }else{
            date.setMonth((Integer) visitMonth(ctx.month()));
        }
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
}
