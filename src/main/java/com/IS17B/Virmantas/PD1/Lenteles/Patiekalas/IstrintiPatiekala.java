package com.IS17B.Virmantas.PD1.Lenteles.Patiekalas;

import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class IstrintiPatiekala {
    public IstrintiPatiekala() {

    }

    public void eliminate(String id) {

        String sql = "DELETE FROM patiekalas WHERE (id = ?)";

        try{
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, id);

            stat.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
