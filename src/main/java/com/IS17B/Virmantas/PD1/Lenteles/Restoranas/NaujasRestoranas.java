package com.IS17B.Virmantas.PD1.Lenteles.Restoranas;

import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class NaujasRestoranas {
    public NaujasRestoranas(){

    }

    public void add(String id, String pavadinimas, String miestas, String adresas){
        String sql = "INSERT INTO restoranas (id, pavadinimas, miestas, adresas) VALUES (?, ?, ?, ?)";
        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1,id);
            stat.setString(2,pavadinimas);
            stat.setString(3,miestas);
            stat.setString(4,adresas);

            stat.execute();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
