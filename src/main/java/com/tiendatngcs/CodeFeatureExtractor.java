package com.tiendatngcs;

import org.apache.commons.text.CaseUtils;
import java.util.regex.*;

public class CodeFeatureExtractor {
    public CodeFeatureExtractor() {

    }

    public static String trimTrailingPunctuations(String word) {
        //  word must have already been trimmed
        Pattern pattern = Pattern.compile(".*\\p{Punct}*$");
        Matcher matcher = pattern.matcher(word);
        matcher.find(); 
        return matcher.group(1);
    }

    public static Boolean wordIsCodeFeature(String word) {
        /* code features includes words
         *      Is a mix of letter and/or numbers and punctuations (not at the end of word)
         *      Are words separated by punctuations or in CamelCase.
         *      Are class or function APIs
         *      Are java keywords
         */
        
        word = word.trim();
        word = word.trimTrailingPunctuations(word);
        // mix of letters and numbers
        return true;
    }
}
