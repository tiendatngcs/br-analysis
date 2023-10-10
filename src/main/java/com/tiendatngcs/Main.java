package com.tiendatngcs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import src.main.java.com.tiendatngcs.CodeNaturalLangExtractor;
import src.main.java.com.tiendatngcs.ChatBot;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        CodeNaturalLangExtractor extractor = new CodeNaturalLangExtractor();

        // Set ChatGPT endpoint and API key
        String endpoint = "https://api.openai.com/v1/chat/completions";
        String apiKey = "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";
            
        // Prompt user for input string
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your message: ");
        String input = reader.readLine();
                
        // Send input to ChatGPT API and display response
        String response = ChatBot.sendQuery(input, endpoint, apiKey);

        LOGGER.info("Response: {}", response);
        } catch (IOException e) {
        LOGGER.error("Error reading input: {}", e.getMessage());
        } catch (JSONException e) {
        LOGGER.error("Error parsing API response: {}", e.getMessage());
        } catch (Exception e) {
        LOGGER.error("Unexpected error: {}", e.getMessage());
        }
        
    }
}