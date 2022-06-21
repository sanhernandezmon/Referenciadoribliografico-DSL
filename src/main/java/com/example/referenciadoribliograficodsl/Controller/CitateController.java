package com.example.referenciadoribliograficodsl.Controller;

import com.example.referenciadoribliograficodsl.Service.CitateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitateController {

    @Autowired
    private final CitateService citateService;

    public CitateController(CitateService citateService) {
        this.citateService = citateService;
    }

    @GetMapping("refer")
    public String getCitation(@RequestBody String references) {
        return citateService.citate(references);
    }
}
