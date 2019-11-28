package com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas;

import com.IS17B.Virmantas.PD1.Anotacijos.ConfigureEmployee;
import com.IS17B.Virmantas.PD1.Anotacijos.Employee;
import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Employee
public class KoreguotiDarbuotoja {
    @ConfigureEmployee
    public KoreguotiDarbuotoja() {
    }

    public void update (String id, String idrestoranas, String vardas, String pavarde, String pareigos, String alga){

        String sql = "UPDATE darbuotojas SET idrestoranas = ?, vardas = ?, pavarde = ?, pareigos = ?, alga = ? WHERE (id = ?)";
        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(6,id);
            stat.setString(1,idrestoranas);
            stat.setString(2,vardas);
            stat.setString(3,pavarde);
            stat.setString(4,pareigos);
            stat.setString(5,alga);

            stat.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
