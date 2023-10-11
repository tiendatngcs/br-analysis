package com.tiendatngcs;

public class CodeIdentifier {
    private int bracket_count = 0;
    private Boolean in_stack_trace = false;
    
    public Boolean is_code(String line) {
        if (line == null) return false;
        String trimmed_line = line.trim();
        if (trimmed_line == null) return false;
        if (trimmed_line.length() == 0) return false;

        if (trimmed_line.charAt(trimmed_line.length()-1) == '}') {
            bracket_count -= 1;
            if (bracket_count < 0) bracket_count = 0; 
            return true;
        }

        if (bracket_count != 0) return true;

        if (trimmed_line.charAt(trimmed_line.length()-1) == '{') {
            bracket_count += 1;
            return true;
        }

        return trimmed_line.charAt(trimmed_line.length()-1) == ';';
    }

    public Boolean is_stacktrace(String line) {
        if (line == null) return false;
        String trimmed_line = line.trim();
        if (trimmed_line == null) return false;
        if (trimmed_line.length() == 0) return false;
        
        if (in_stack_trace) {
            if (trimmed_line.startsWith("at") || trimmed_line.contains("Exception")) {
                return true;
            }
            in_stack_trace = false;
            return false;
        }

        // not in stack trace
        if (trimmed_line.contains("Exception")) {
            in_stack_trace = true;
            return true;
        }
        return false;

    }
    
}
