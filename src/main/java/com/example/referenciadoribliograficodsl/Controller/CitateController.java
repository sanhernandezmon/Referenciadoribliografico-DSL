package com.example.referenciadoribliograficodsl.Controller;

import java.io.IOException;

import com.example.referenciadoribliograficodsl.Service.CitateService;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitateController {

    private CitateService citateService;

    @GetMapping("refer")
    public String getCitation(String references) throws IOException {
        return citateService.citate(references);
    }
}
