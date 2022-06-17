package com.example.referenciadoribliograficodsl.Entity;

import java.util.Date;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Citation {

    private CitationType citationType;
    private String authorName;
    private String authorLastName;
    private String title;
    private Date publicationDate;
    private Date consultDate;
    private String resume;

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

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    private String citateEnglishBook(Citation citation){
        return "";
    }

    private String citateEnglishWebsite(Citation citation){
        return "";
    }

    private String citateEnglishArticle(Citation citation){
        return "";
    }

    private String citateEnglishImage(Citation citation){
        return "";
    }

    private String citateSpanishBook(Citation citation){
        return "";
    }

    private String citateSpanishWebsite(Citation citation){
        return "";
    }

    private String citateSpanishArticle(Citation citation){
        return "";
    }

    private String citateSpanishImage(Citation citation){
        return "";
    }

    public String toString(Lenguaje lenguaje) {
        switch (lenguaje){
            case ENGLISH:
                switch (citationType){
                    case book:
                        return citateSpanishBook(this);
                    case website:
                        return citateSpanishWebsite(this);
                    case image:
                        return citateSpanishImage(this);
                    case article:
                        return citateSpanishArticle(this);
                }
            case SPANISH:
                switch (citationType){
                    case book:
                        return citateEnglishBook(this);
                    case website:
                        return citateEnglishWebsite(this);
                    case image:
                        return citateEnglishImage(this);
                    case article:
                        return citateEnglishArticle(this);
                }
        }
        return null;
    }
}
