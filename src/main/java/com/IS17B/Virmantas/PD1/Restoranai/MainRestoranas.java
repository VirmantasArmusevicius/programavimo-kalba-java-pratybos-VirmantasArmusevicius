package com.IS17B.Virmantas.PD1.Restoranai;

import com.IS17B.Virmantas.PD1.Lenteles.Patiekalas.InvalidMenuChoiseExeption;

import java.sql.*;


public class MainRestoranas {


    //private static final String SQL = "SELECT * FROM darbuotojas WHERE id <= ?";
    public static void main(String[] args) throws SQLException, InvalidMenuChoiseExeption {
        MainMenu menu = new MainMenu();
        menu.mainMenu();







       /* double mid;

        try {
            mid = getInt("Enter ID");
        } catch (Exception e) {
            System.err.println("Invalid Number");
            return;
        }

        ResultSet rs = null;

        try {
            Connection conn = DuomenuBazesPrisijungimas.getConnection();
            PreparedStatement stat = conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stat.setDouble(1,mid);

            rs = stat.executeQuery();
            Darbuotojas.getDrabuotojas(rs);

        } catch (SQLException e) {
            System.err.println(e);
        }
        finally {
            if (rs != null){
                rs.close();
            }
        }*/




        /*int i = 3; // pasirenkamas norimas irasas

        try {
            Connection con = DuomenuBazesPrisijungimas.getConnection();
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stat.executeQuery("SELECT * FROM darbuotojas");

            //Darbuotojas.getDrabuotojas(rs); //Atspausdina visa sarasa
            //rs.absolute(i); //Atpausdinimas irasas i
            //System.out.println(rs.getString("vardas"));
            //System.out.println(rs.getString("vardas"));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }*/

    }


}
