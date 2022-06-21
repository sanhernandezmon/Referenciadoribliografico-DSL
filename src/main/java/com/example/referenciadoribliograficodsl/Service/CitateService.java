package com.example.referenciadoribliograficodsl.Service;

import java.io.IOException;

import Gen.citatorLexer;
import Gen.citatorParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.springframework.stereotype.Service;

@Service
public class CitateService {

    public String citate(String text)  {
        citatorLexer lexer = new citatorLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        citatorParser parser = new citatorParser(tokens);
        ParseTree tree = parser.reference();
        Visitor loader = new Visitor();
        loader.visit(tree);
        return loader.bibliography.toString();
    }

}
