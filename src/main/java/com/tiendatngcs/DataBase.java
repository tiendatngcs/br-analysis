package com.tiendatngcs;

import java.sql.*;

public class DataBase {
    public Connection conn = null;
    public Statement statement = null;

    public DataBase(String db_path) {
        String url = "jdbc:sqlite:" + db_path;
        System.out.println("Connecting to " + url);

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
            statement = conn.createStatement();

        }catch (Exception e) {
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
    }

    public void disconnect() {
        try {
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
    }

    public ResultSet executeQuery(String queryString) {
        ResultSet rs = null;
        try {
            rs = statement.executeQuery(queryString);
        }catch (Exception e) {
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
        return rs;
    }

    public String[] get_column_names(String tableName) {
        String columnNamesString = "";
        try {
            String query = "PRAGMA table_info(" + tableName + ")";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String columnName = resultSet.getString("name");
                System.out.println("Column Name: " + columnName);
                columnNamesString += columnName + ";";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String[] columnNames = columnNamesString.split(";");
        for (String columnName : columnNames) {
            System.out.println("Column: " + columnName);
        }
        System.out.println("===========================");
        return columnNames;
    }
}
