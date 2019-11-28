package com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas;

import com.IS17B.Virmantas.PD1.Anotacijos.Employee;
import com.IS17B.Virmantas.PD1.Anotacijos.NewEmployee;
import com.IS17B.Virmantas.PD1.Restoranai.DuomenuBazesPrisijungimas;

import java.sql.*;

@Employee
public class NaujasDarbuotojas {

    public NaujasDarbuotojas(){

    }
@NewEmployee(id = 1, idDarboVieta = 2, name = "Rimantas", lastname = "Antrokas", job = "Valytojas", alga = 600)
    public void add(String id, String idrestoranas, String vardas, String pavarde, String pareigos, String alga){

        String sql = "INSERT INTO darbuotojas (id, idrestoranas, vardas, pavarde, pareigos, alga) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1,id);
            stat.setString(2,idrestoranas);
            stat.setString(3,vardas);
            stat.setString(4,pavarde);
            stat.setString(5,pareigos);
            stat.setString(6,alga);

            stat.execute();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
