package com.tiendatngcs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// import com.google.common.io.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;

import com.tiendatngcs.antlr4.JavaLexer;
import com.tiendatngcs.antlr4.JavaParser;
import com.tiendatngcs.antlr4.JavaParserListener;

public class Main {
    // private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        String javaClassContent = "public class SampleClass { void DoSomething(){} }";
        JavaLexer lexer = new JavaLexer(CharStreams.fromString(javaClassContent));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        // ParseTree tree = parser.compilationUnit();
        // ParseTreeWalker walker = new ParseTreeWalker();
        // JavaParserListener listener= new JavaParserListener();

        System.out.println("Num syntax error: " + parser.getNumberOfSyntaxErrors());
    }
}