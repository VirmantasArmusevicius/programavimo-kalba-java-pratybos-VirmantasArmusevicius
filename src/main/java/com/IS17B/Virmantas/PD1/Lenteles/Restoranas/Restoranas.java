package com.IS17B.Virmantas.PD1.Lenteles.Restoranas;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Restoranas {
    public static void getRestoranas(ResultSet rs) throws SQLException {

        while (rs.next()){
            StringBuffer buffer = new StringBuffer();
            buffer.append("Restorano ID: " + rs.getInt("id")+"|");
            buffer.append("Restorano pavadinimas: " + rs.getString("pavadinimas")+"|");
            buffer.append("Miestas pievadinimas: " + rs.getString("miestas")+ "|");
            buffer.append("Adresas: " + rs.getString("adresas"));

            System.out.println(buffer.toString());
        }
    }
}
