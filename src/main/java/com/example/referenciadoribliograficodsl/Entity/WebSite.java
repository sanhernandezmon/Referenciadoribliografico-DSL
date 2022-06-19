package com.example.referenciadoribliograficodsl.Entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WebSite {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
