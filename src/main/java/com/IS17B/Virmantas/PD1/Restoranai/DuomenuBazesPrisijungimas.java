package com.IS17B.Virmantas.PD1.Restoranai;

import java.sql.*;

public class DuomenuBazesPrisijungimas {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "karDinoL4s@653";
    private static final String CONN = "jdbc:mysql://localhost:3306/restoranai";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN,USERNAME,PASSWORD);
    }
}
