package com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas;

import com.IS17B.Virmantas.PD1.Anotacijos.DeleteEmployee;
import com.IS17B.Virmantas.PD1.Anotacijos.Employee;
import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.*;
@Employee
public class IstrintiDarbuotoja {

    public IstrintiDarbuotoja() {

    }

    public void eliminate(@DeleteEmployee String id) {

        String sql = "DELETE FROM darbuotojas WHERE (id = ?)";

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
