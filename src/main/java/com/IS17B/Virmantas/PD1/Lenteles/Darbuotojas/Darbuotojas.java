package com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas;

import com.IS17B.Virmantas.PD1.Anotacijos.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

@Employee
public class Darbuotojas {


    public static void getDarbuotojas(ResultSet rs) throws SQLException {

        while (rs.next()){
            StringBuffer buffer = new StringBuffer();
            buffer.append("Darbuotojo ID: " + rs.getInt("id")+"|");
            buffer.append("Darbo vietos ID: " + rs.getInt("idrestoranas")+"|");
            buffer.append("Vardas: " + rs.getString("vardas")+"|");
            buffer.append("Pavarde: " + rs.getString("pavarde")+"|");
            buffer.append("Pareigos: " + rs.getString("pareigos")+"|");
            buffer.append("Alga: " + rs.getDouble("alga"));

            System.out.println(buffer.toString());
        }
    }
}
