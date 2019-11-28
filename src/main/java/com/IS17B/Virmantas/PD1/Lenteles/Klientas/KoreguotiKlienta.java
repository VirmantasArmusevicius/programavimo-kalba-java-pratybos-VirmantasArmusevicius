package com.IS17B.Virmantas.PD1.Lenteles.Klientas;

import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class KoreguotiKlienta {
    public KoreguotiKlienta() {
    }

    public void update (String id, String idkortele, String vardas, String pavarde){

        String sql = "UPDATE klientas SET idkortele = ?, vardas = ?, pavarde = ? WHERE (id = ?)";
        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(4,id);
            stat.setString(1,idkortele);
            stat.setString(2,vardas);
            stat.setString(3,pavarde);

            stat.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
