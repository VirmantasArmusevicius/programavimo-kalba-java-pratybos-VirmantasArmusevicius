package com.IS17B.Virmantas.PD1.Lenteles.Patiekalas;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Patiekalas {
    public static void getPatiekalas(ResultSet rs) throws SQLException {

        while (rs.next()){
            StringBuffer buffer = new StringBuffer();
            buffer.append("Patiekalo ID: " + rs.getInt("id")+"|");
            buffer.append("Patiekalo pavadinimas: " + rs.getString("pavadinimas")+"|");
            buffer.append("Patiekalo kaina: " + rs.getString("kaina")+"|");
            buffer.append("Patiekalo tipas: " + rs.getString("tipas"));

            System.out.println(buffer.toString());
        }
    }
}
