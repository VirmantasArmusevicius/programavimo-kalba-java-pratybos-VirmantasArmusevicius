package com.IS17B.Virmantas.PD1.Lenteles.Kortele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Kortele {
    public static void getKortele(ResultSet rs) throws SQLException {

        GaliojimoTrukme expDate = GaliojimoTrukme.NEGALIOJA;
        GaliojimoTrukme expDate1 = GaliojimoTrukme.GALIOJA;
        Date today = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(today);

        while (rs.next()){
            StringBuffer buffer = new StringBuffer();
            buffer.append("Korteles ID: " + rs.getInt("id")+"|");
            buffer.append("Kliento ID: " + rs.getInt("idklientas")+"|");
            buffer.append("Restorano ID: " + rs.getString("idrestoranas")+"|");
            if (rs.getDate("galiojimo_laikas").before(today)) {
                buffer.append("Galiojimo laikas: " + rs.getString("galiojimo_laikas")+" " + expDate);
            }
            else {
                buffer.append("Galiojimo laikas: " + rs.getString("galiojimo_laikas")+" " + expDate1);
            }
            System.out.println(buffer.toString());
        }
    }
}
