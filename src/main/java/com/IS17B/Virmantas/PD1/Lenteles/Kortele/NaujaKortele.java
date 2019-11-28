package com.IS17B.Virmantas.PD1.Lenteles.Kortele;

import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class NaujaKortele {
    public NaujaKortele(){

}

    public void add(String id, String idklientas, String idrestoranas, String galiojimo_laikas){
        String sql = "INSERT INTO kortele (id, idklientas, idrestoranas, galiojimo_laikas) VALUES (?, ?, ?, ?)";
        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1,id);
            stat.setString(2,idklientas);
            stat.setString(3,idrestoranas);
            stat.setString(4,galiojimo_laikas);

            stat.execute();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
