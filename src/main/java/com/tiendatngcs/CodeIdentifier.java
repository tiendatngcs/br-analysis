package com.tiendatngcs;

public class CodeIdentifier {
    
    public static Boolean is_code(String line) {
        if (line == null) return false;
        String trimmed_line = line.trim();
        if (trimmed_line == null) return false;
        if (trimmed_line.length() == 0) return false;
        return trimmed_line.charAt(trimmed_line.length()-1) == '{' || trimmed_line.charAt(trimmed_line.length()-1) == ';';
    }
    
}
