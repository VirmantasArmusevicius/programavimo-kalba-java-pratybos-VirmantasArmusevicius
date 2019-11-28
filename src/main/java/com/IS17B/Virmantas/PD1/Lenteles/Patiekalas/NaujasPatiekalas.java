package com.IS17B.Virmantas.PD1.Lenteles.Patiekalas;

import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class NaujasPatiekalas {
    public NaujasPatiekalas(){

}

    public void add(String id, String pavadinimas, String kaina, String tipas){
        String sql = "INSERT INTO patiekalas (id, pavadinimas, kaina, tipas) VALUES (?, ?, ?, ?)";
        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1,id);
            stat.setString(2,pavadinimas);
            stat.setString(3,kaina);
            stat.setString(4,tipas);

            stat.execute();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
