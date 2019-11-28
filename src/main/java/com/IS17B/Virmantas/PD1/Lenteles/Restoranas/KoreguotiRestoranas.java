package com.IS17B.Virmantas.PD1.Lenteles.Restoranas;

import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class KoreguotiRestoranas {
    public KoreguotiRestoranas() {
    }

    public void update (String id, String pavadinimas, String miestas, String adresas){

        String sql = "UPDATE restoranas SET pavadinimas = ?, miestas = ?, adresas = ? WHERE (id = ?)";
        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(4,id);
            stat.setString(1,pavadinimas);
            stat.setString(2,miestas);
            stat.setString(3,adresas);

            stat.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
