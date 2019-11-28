package com.IS17B.Virmantas.PD1.Restoranai;

import com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas.NaujasDarbuotojas;
import com.IS17B.Virmantas.PD1.Lenteles.Klientas.NaujasKlientas;
import com.IS17B.Virmantas.PD1.Lenteles.Kortele.NaujaKortele;
import com.IS17B.Virmantas.PD1.Lenteles.Patiekalas.InvalidMenuChoiseExeption;
import com.IS17B.Virmantas.PD1.Lenteles.Restoranas.NaujasRestoranas;
import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import static com.IS17B.Virmantas.PD1.Restoranai.MainMenu.mainMenu;


public class DataGenerator {
    Faker faker = new Faker();
    Scanner input = new Scanner(System.in);
    Random r = new Random();

    public void RestoranasDataGenerator() throws SQLException, InvalidMenuChoiseExeption
    {
        NaujasRestoranas create = new NaujasRestoranas();

        System.out.println("Pasirinkite kiek norite sugeneruoti duomenu?");
        String ans = input.nextLine();
        int pasirinkimas = Integer.parseInt(ans);
        int a = 3;

        for(int i = 0; i < pasirinkimas; i++)
        {
            String id = Integer.toString(a+i);
            String pavadinimas = faker.name().title();
            String miestas = faker.address().cityName();
            String adresas = faker.address().streetAddress();

            create.add(id, pavadinimas, miestas, adresas);
        }
        mainMenu();
    }
    public void darbuotojasDataGenerator() throws SQLException, InvalidMenuChoiseExeption
    {
        NaujasDarbuotojas create = new NaujasDarbuotojas();

        System.out.println("Pasirinkite kiek norite sugeneruoti duomenu?");
        String ans = input.nextLine();
        int pasirinkimas = Integer.parseInt(ans);
        int a = 14;//Esamu Darbuotoju skaicius
        int x = 1; // Min restoranu skaicius
        int y = 50; // Max restoranu skaicius


        for (int i = 0; i < pasirinkimas; i++) {
            String id = Integer.toString(a + i);
            String idrestoranas = Integer.toString(r.nextInt(y - x) + x);
            String vardas = faker.name().firstName();
            String pavarde = faker.name().lastName();
            String pareigos = faker.job().position();
            String alga = Integer.toString(faker.number().numberBetween(550, 2800));
            create.add(id, idrestoranas, vardas, pavarde, pareigos, alga);
        }
        mainMenu();
    }
    public void KlientasDataGenerator() throws SQLException, InvalidMenuChoiseExeption {
        NaujasKlientas create = new NaujasKlientas();
        NaujaKortele create2 = new NaujaKortele();

        System.out.println("Pasirinkite kiek norite sugeneruoti duomenu?");
        String ans = input.nextLine();
        int pasirinkimas = Integer.parseInt(ans);
        int a = 6;//Esamu Klientu skaicius
        int x = 1; // Min restoranu skaicius
        int y = 50; // Max restoranu skaicius

        for (int i = 0; i < pasirinkimas; i++) {
            String id = Integer.toString(a + i);
            String idkortele = Integer.toString(a + i);
            String idrestoranas = Integer.toString(r.nextInt(y - x) + x);
            String vardas = faker.name().firstName();
            String pavarde = faker.name().lastName();
            String year = Integer.toString(faker.number().numberBetween(2018,2024));
            String month = Integer.toString(faker.number().numberBetween(1,12));
            String day = Integer.toString(faker.number().numberBetween(1,30));
            String galiojimo_laikas = year+"-"+month+"-"+day;

            String idklientas = id;

            create.add(id, idkortele, vardas, pavarde);
            create2.add(id, idklientas, idrestoranas, galiojimo_laikas);
        }
        mainMenu();
    }
}
