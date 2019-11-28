package com.IS17B.Virmantas.PD1.Lenteles.Kortele;

import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class KoreguotiKortele {
    public KoreguotiKortele() {
}

    public void update (String id, String idklientas, String idrestoranas, String galiojimo_laikas){

        String sql = "UPDATE kortele SET idklientas = ?, idrestoranas = ?, galiojimo_laikas = ? WHERE (id = ?)";
        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(4,id);
            stat.setString(1,idklientas);
            stat.setString(2,idrestoranas);
            stat.setString(3,galiojimo_laikas);

            stat.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
