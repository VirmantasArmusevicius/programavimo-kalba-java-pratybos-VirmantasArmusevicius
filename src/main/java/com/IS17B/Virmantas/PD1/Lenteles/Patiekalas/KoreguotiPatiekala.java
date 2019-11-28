package com.IS17B.Virmantas.PD1.Lenteles.Patiekalas;

import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class KoreguotiPatiekala {
    public KoreguotiPatiekala() {
    }

    public void update (String id, String pavadinimas, String kaina, String tipas){

        String sql = "UPDATE patiekalas SET pavadinimas = ?, kaina = ?, tipas = ? WHERE (id = ?)";
        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(4,id);
            stat.setString(1,pavadinimas);
            stat.setString(2,kaina);
            stat.setString(3,tipas);

            stat.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
