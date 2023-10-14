package com.tiendatngcs;

import com.tiendatngcs.antlr4.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import org.apache.commons.lang3.SerializationUtils;

import org.antlr.v4.runtime.*;
import java.sql.*;
import java.lang.Class;

public class Main {
    // private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static String[] get_processed_table_names (String[] tableNames) {
        String[] processedTableNames = SerializationUtils.clone(tableNames);
        for (int i = 0 ; i < processedTableNames.length; i++) {
            processedTableNames[i] += "processed";

            System.out.println(processedTableNames[i]);
            System.out.println(tableNames[i]);
            System.out.println("===================");
        }
        return processedTableNames;
    }

    public static void main(String[] args) {

        String[] tableNames = {"eclipse",          "hadoop_1day",      "mozilla_initial",  "vscode",         
                            "eclipse_initial",  "hadoop_old",       "mozilla_old",    
                            "eclipse_old",      "kibana",           "spark",          
                            "hadoop",           "mozilla",          "spark_1day"};

        String[] processedTableNames = get_processed_table_names(tableNames);


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

        DataBase db = new DataBase(db_path);
        DataBase db_processed = new DataBase(db_path + "_processed");
        
        String codeString = "";
        String textString = "";
        String stacktraceString = "";


        try {
            // Class.forName("org.sqlite.JDBC");
            // conn = DriverManager.getConnection(url);
            // conn.setAutoCommit(false);
            // statement = conn.createStatement();
            for (String tableName : tableNames) {
                
                ResultSet rs = db.statement.executeQuery("Select * from " + tableName + " limit 10");
                while (rs.next()) {
                    String br_description = rs.getString("description");
                    String[] lines = br_description.split("\n", 0);
                    for (String line: lines) {
                        System.out.println(line);
                        if (classifier.is_code(line)) {
                            // writer_code.println(line);
                            codeString = codeString + line + "\n";
                        } else if (classifier.is_stacktrace(line)) {
                            // writer_stacktrace.println(line);
                            stacktraceString = stacktraceString + line + "\n";
                        } else {
                            // writer_text.println(line);
                            textString = textString + line + "\n";
                        }   
                    }
                        
                    String[] column_names = db.get_column_names(tableName);

                    for (String column_name : column_names) {
                        // retaining categorical columns, delete text columns (summary and description) and add new text, code, stacktrace columns
                        
                    }

                }

                rs.close();
            }

            // statement.close();
            // conn.close();
        } catch (Exception e) {
            System.err.println( e + " -in getDepartmentMembers" + e.getClass().getName() + ": " + e.getMessage());
        }
        writer_code.close();
        writer_text.close();
        db.disconnect();


    }
}