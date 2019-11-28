package com.IS17B.Virmantas.PD1.Lenteles.Klientas;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Klientas {
    public static void getKlientas(ResultSet rs) throws SQLException {

        while (rs.next()){
            StringBuffer buffer = new StringBuffer();
            buffer.append("Kliento ID: " + rs.getInt("id")+"|");
            buffer.append("Korteles ID: " + rs.getInt("idkortele")+"|");
            buffer.append("Vardas: " + rs.getString("vardas")+"|");
            buffer.append("Pavarde: " + rs.getString("pavarde"));

            System.out.println(buffer.toString());
        }
    }
}
