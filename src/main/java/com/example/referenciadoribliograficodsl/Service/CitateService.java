package com.example.referenciadoribliograficodsl.Service;

import java.io.IOException;

import Gen.citatorLexer;
import Gen.citatorParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CitateService {

    public String citate(String text) throws IOException {
        citatorLexer lexer = new citatorLexer(CharStreams.fromFileName("input/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        citatorParser parser = new citatorParser(tokens);
        ParseTree tree = parser.reference();
        Visitor loader = new Visitor();
        loader.visit(tree);
        return loader.bibliography.toString();
    }

}
