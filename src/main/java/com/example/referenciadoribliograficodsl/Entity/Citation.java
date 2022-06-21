package com.example.referenciadoribliograficodsl.Entity;

import java.util.Date;
import java.util.List;

import com.example.referenciadoribliograficodsl.util.Resolver;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Citation {

    private final Resolver resolver = new Resolver();

    private CitationType citationType;

    private String authorName;

    private String authorLastName;

    private String title;

    private Date publicationDate;

    private Date consultDate;

    private String city;

    private String editorial;

    private WebSite webSite;

    private Articulo articulo;

    public void setCitationType(CitationType citationType) {
        this.citationType = citationType;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
    public void setConsultDate(Date consultDate) {
        this.consultDate = consultDate;
    }
    public void setCity(String city) { this.city = city;}
    public void setEditorial(String editorial) { this.editorial = editorial;}
    public void setWebSite(WebSite webSite) {this.webSite = webSite;}

    public void setArticulo(Articulo articulo) { this.articulo = articulo;}



    public CitationType getCitationType() {
        return citationType;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getTitle() {
        return title;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public Date getConsultDate() {
        return consultDate;
    }

    public String getCity() {
        return city;
    }

    public String getEditorial() {
        return editorial;
    }

    public WebSite getWebSite() {
        return webSite;
    }

    public Articulo getArticulo(){
        return articulo;
    }

    public String toString(Lenguaje lenguaje) {
        switch (lenguaje){
            case SPANISH:
                switch (citationType){
                    case book:
                        return resolver.citateSpanishBook(this);
                    case website:
                        return resolver.citateSpanishWebsite(this);
                    case article:
                        return resolver.citateSpanishArticle(this);
                }
            case ENGLISH:
                switch (citationType){
                    case book:
                        return resolver.citateEnglishBook(this);
                    case website:
                        return resolver.citateEnglishWebsite(this);
                    case article:
                        return resolver.citateEnglishArticle(this);
                }
        }
        return null;
    }


}
