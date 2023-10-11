package com.tiendatngcs;

import com.tiendatngcs.antlr4.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;

import org.antlr.v4.runtime.*;
import java.sql.*;
import java.lang.Class;

public class Main {
    // private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        // String javaClassContent = "public class SampleClass {";
        if (args.length != 1) {
            System.exit(0);
        }
        String db_path = args[0];

        // open two files for write
        FileWriter fileWriter_code = null;
        try {
            fileWriter_code = new FileWriter("codeset.txt");
        } catch(Exception e) {

        }
        PrintWriter writer_code = new PrintWriter(fileWriter_code);


        FileWriter fileWriter_text = null;
        try {
            fileWriter_text = new FileWriter("textset.txt");
        } catch(Exception e) {

        }
        PrintWriter writer_text = new PrintWriter(fileWriter_text);

        FileWriter fileWriter_stacktrace = null;
        try {
            fileWriter_stacktrace = new FileWriter("stacktraceset.txt");
        } catch(Exception e) {

        }
        PrintWriter writer_stacktrace = new PrintWriter(fileWriter_stacktrace);

        Connection conn = null;
        Statement statement = null;
        // Class.forName("org.sqlite.JDBC");

        String url = "jdbc:sqlite:" + db_path;
        System.out.println("Connecting to " + url);
        CodeIdentifier classifier = new CodeIdentifier();
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
            statement = conn.createStatement();

            ResultSet rs = statement.executeQuery("Select * from eclipse limit 10");
            while (rs.next()) {
                String br_description = rs.getString("description");
                String[] lines = br_description.split("\n", 0);
                for (String line: lines) {
                    System.out.println(line);
                    if (classifier.is_code(line)) {
                        writer_code.println(line);
                    } else if (classifier.is_stacktrace(line)) {
                        writer_stacktrace.println(line);
                    } else {
                        writer_text.println(line);
                    }   
                }
            }

            rs.close();
            statement.close();
            conn.close();
        } catch (Exception e) {
            System.err.println( e + " -in getDepartmentMembers" + e.getClass().getName() + ": " + e.getMessage());
        } finally {  
            try {  
                if (conn != null) {  
                    conn.close();  
                }  
            } catch (SQLException ex) {  
                System.out.println(ex.getMessage());  
            }  
        } 
        writer_code.close();
        writer_text.close();


    }
}