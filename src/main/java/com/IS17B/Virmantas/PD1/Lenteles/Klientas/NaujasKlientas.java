package com.IS17B.Virmantas.PD1.Lenteles.Klientas;

import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class NaujasKlientas {
    public NaujasKlientas(){

    }

    public void add(String id, String idkortele, String vardas, String pavarde){
        String sql = "INSERT INTO klientas (id, idkortele, vardas, pavarde) VALUES (?, ?, ?, ?)";
        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1,id);
            stat.setString(2,idkortele);
            stat.setString(3,vardas);
            stat.setString(4,pavarde);

            stat.execute();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

