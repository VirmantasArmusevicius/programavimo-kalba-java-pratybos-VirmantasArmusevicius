package com.IS17B.Virmantas.PD1.Restoranai;

import com.IS17B.Virmantas.PD1.Anotacijos.Explanation;
import com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas.IstrintiDarbuotoja;
import com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas.KoreguotiDarbuotoja;
import com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas.NaujasDarbuotojas;
import com.IS17B.Virmantas.PD1.Lenteles.Klientas.IstrintiKlienta;
import com.IS17B.Virmantas.PD1.Lenteles.Klientas.KoreguotiKlienta;
import com.IS17B.Virmantas.PD1.Lenteles.Klientas.NaujasKlientas;
import com.IS17B.Virmantas.PD1.Lenteles.Kortele.IstrintiKortele;
import com.IS17B.Virmantas.PD1.Lenteles.Kortele.KoreguotiKortele;
import com.IS17B.Virmantas.PD1.Lenteles.Kortele.NaujaKortele;
import com.IS17B.Virmantas.PD1.Lenteles.Patiekalas.*;
import com.IS17B.Virmantas.PD1.Lenteles.Restoranas.IstrintiRestoranas;
import com.IS17B.Virmantas.PD1.Lenteles.Restoranas.KoreguotiRestoranas;
import com.IS17B.Virmantas.PD1.Lenteles.Restoranas.NaujasRestoranas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Scanner;

public interface Menu {
    public void naujas() throws SQLException, ParseException, InvalidMenuChoiseExeption;
    public void trinti() throws SQLException, InvalidMenuChoiseExeption;
    public void koreguoti() throws SQLException, InvalidMenuChoiseExeption;
    public void atnaujinti() throws SQLException, InvalidMenuChoiseExeption;
}
    class Restoranas implements Menu {


    Scanner input = new Scanner(System.in);
    MainMenu menu = new MainMenu();

    @Override
    public void naujas() throws SQLException, InvalidMenuChoiseExeption {
        System.out.println("Iveskite restorano ID: ");
        String id = input.nextLine();
        System.out.println("Iveskite restorano pavadinima: ");
        String pavadinimas = input.nextLine();
        System.out.println("Iveskite miesto pavadinima: ");
        String miestas = input.nextLine();
        System.out.println("Iveskite adresa: ");
        String adresas = input.nextLine();

        NaujasRestoranas create = new NaujasRestoranas();
        create.add(id, pavadinimas, miestas, adresas);
        menu.mainMenu();

    }

    @Override
    public void trinti() throws SQLException, InvalidMenuChoiseExeption {
        System.out.println("Iveskite ID kuri norite istrinti");
        String id = input.nextLine();
        IstrintiRestoranas delete = new IstrintiRestoranas();
        delete.eliminate(id);
        menu.mainMenu();
    }

    @Override
    public void koreguoti() throws SQLException, InvalidMenuChoiseExeption {
        System.out.println("Iveskite Restorano ID: ");
        String id = input.nextLine();
        System.out.println("Iveskite restorano pavadinima: ");
        String pavadinimas = input.nextLine();
        System.out.println("Iveskite miesto pavadinima: ");
        String miestas = input.nextLine();
        System.out.println("Iveskite adresa: ");
        String adresas = input.nextLine();

        KoreguotiRestoranas koreguoti = new KoreguotiRestoranas();
        koreguoti.update(id, pavadinimas, miestas, adresas);
        menu.mainMenu();

    }

    @Override
    public void atnaujinti() throws SQLException, InvalidMenuChoiseExeption {
        com.IS17B.Virmantas.PD1.Lenteles.Restoranas.Restoranas restoranas = new com.IS17B.Virmantas.PD1.Lenteles.Restoranas.Restoranas();
        Connection con = DuomenuBazesPrisijungimas.getConnection();
        Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stat.executeQuery("SELECT * FROM restoranas");

        restoranas.getRestoranas(rs); //Atspausdina visa sarasa

        menu.mainMenu();
    }
}
@Explanation(explain = "Cia yra rasoma informacija apie Darbuotoja")
    class Darbuotojas implements Menu {


        Scanner input = new Scanner(System.in);
        MainMenu menu = new MainMenu();

        @Override
         public void naujas() throws SQLException, InvalidMenuChoiseExeption {

                System.out.println("Iveskite darbuotojo ID: ");
                String id = input.nextLine();
                System.out.println("Iveskite restorano kur dirba darbuotojas ID: ");
                String idrestoranas = input.nextLine();
                System.out.println("Iveskite darbuotojo varda: ");
                String vardas = input.nextLine();
                System.out.println("Iveskite darbuotojo pavarde: ");
                String pavarde = input.nextLine();
                System.out.println("Iveskite darbuotojo pareigos: ");
                String pareigos = input.nextLine();
                System.out.println("Iveskite darbuotojo alga: ");
                String alga = input.nextLine();


                int result = Integer.parseInt(alga);

            while (result<0) {
                System.out.println("Just ivedete netinkama skaiciu, prasome ivesti skaitciu didesni uz 0 ");
                alga = input.nextLine();
                result = Integer.parseInt(alga);
            }
                NaujasDarbuotojas create = new NaujasDarbuotojas();
                create.add(id, idrestoranas, vardas, pavarde, pareigos, alga);
                menu.mainMenu();

         }

        @Override
         public void trinti() throws SQLException, InvalidMenuChoiseExeption {
            System.out.println("Iveskite ID kuri norite istrinti");
            String id = input.nextLine();
            IstrintiDarbuotoja delete = new IstrintiDarbuotoja();
            delete.eliminate(id);
            menu.mainMenu();
        }

        @Override
        public void koreguoti() throws SQLException, InvalidMenuChoiseExeption {
            System.out.println("Iveskite darbuotojo ID: ");
            String id = input.nextLine();
            System.out.println("Iveskite restorano kur dirba darbuotojas ID: ");
            String idrestoranas = input.nextLine();
            System.out.println("Iveskite darbuotojo varda: ");
            String vardas = input.nextLine();
            System.out.println("Iveskite darbuotojo pavarde: ");
            String pavarde = input.nextLine();
            System.out.println("Iveskite darbuotojo pareigos: ");
            String pareigos = input.nextLine();
            System.out.println("Iveskite darbuotojo alga: ");
            String alga = input.nextLine();

            int result = Integer.parseInt(alga);

            while (result<0) {
                System.out.println("Just ivedete netinkama skaiciu, prasome ivesti skaitciu didesni uz 0 ");
                alga = input.nextLine();
                result = Integer.parseInt(alga);
            }
            KoreguotiDarbuotoja koreguoti = new KoreguotiDarbuotoja();
            koreguoti.update(id, idrestoranas, vardas, pavarde, pareigos, alga);
            menu.mainMenu();

        }

        @Override
        public void atnaujinti() throws SQLException, InvalidMenuChoiseExeption {
            com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas.Darbuotojas worker = new com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas.Darbuotojas();
            Connection con = DuomenuBazesPrisijungimas.getConnection();
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stat.executeQuery("SELECT * FROM darbuotojas");


            worker.getDarbuotojas(rs); //Atspausdina visa sarasa

            menu.mainMenu();
        }
    }
    class Klientas implements Menu{

        Scanner input = new Scanner(System.in);
        MainMenu menu = new MainMenu();

        @Override
        public void naujas() throws SQLException, InvalidMenuChoiseExeption {
            System.out.println("Ivekite kliento ID: ");
            String id = input.nextLine();
            System.out.println("Ivekite korteles ID: ");
            String idkortele = input.nextLine();
            System.out.println("Ivekite kliento varda: ");
            String vardas = input.nextLine();
            System.out.println("Ivekite kliento pavarde: ");
            String pavarde = input.nextLine();

            NaujasKlientas create = new NaujasKlientas();
            create.add(id, idkortele, vardas, pavarde);
            menu.mainMenu();


        }

        @Override
        public void trinti() throws SQLException, InvalidMenuChoiseExeption {
            System.out.println("Iveskite ID kuri norite istrinti");
            String id = input.nextLine();
            IstrintiKlienta delete = new IstrintiKlienta();
            delete.eliminate(id);
            menu.mainMenu();
        }

        @Override
        public void koreguoti() throws SQLException, InvalidMenuChoiseExeption {
            System.out.println("Iveskite kliento ID: ");
            String id = input.nextLine();
            System.out.println("Iveskite kliento korteles ID: ");
            String idkortele = input.nextLine();
            System.out.println("Iveskite kliento varda: ");
            String vardas = input.nextLine();
            System.out.println("Iveskite kliento pavarde: ");
            String pavarde = input.nextLine();

            KoreguotiKlienta koreguoti = new KoreguotiKlienta();
            koreguoti.update(id, idkortele, vardas, pavarde);
            menu.mainMenu();

        }

        @Override
        public void atnaujinti() throws SQLException, InvalidMenuChoiseExeption {
            com.IS17B.Virmantas.PD1.Lenteles.Klientas.Klientas klientas = new com.IS17B.Virmantas.PD1.Lenteles.Klientas.Klientas();
            Connection con = DuomenuBazesPrisijungimas.getConnection();
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stat.executeQuery("SELECT * FROM klientas");

            klientas.getKlientas(rs); //Atspausdina visa sarasa

            menu.mainMenu();
        }
    }
    class Kortele implements Menu{

        Scanner input = new Scanner(System.in);
        MainMenu menu = new MainMenu();

        @Override
        public void naujas() throws SQLException, InvalidMenuChoiseExeption {
            System.out.println("Ivekite korteles ID: ");
            String id = input.nextLine();
            System.out.println("Ivekite kliento ID: ");
            String idklientas = input.nextLine();
            System.out.println("Ivekite restorano ID: ");
            String idrestoranas = input.nextLine();
            System.out.println("Ivekite galiojimo laika: ");
            String galiojimo_laikas = input.nextLine();

            NaujaKortele create = new NaujaKortele();
            create.add(id, idklientas, idrestoranas, galiojimo_laikas);
            menu.mainMenu();


        }

        @Override
        public void trinti() throws SQLException, InvalidMenuChoiseExeption {
            System.out.println("Iveskite ID kuri norite istrinti");
            String id = input.nextLine();
            IstrintiKortele delete = new IstrintiKortele();
            delete.eliminate(id);
            menu.mainMenu();
        }

        @Override
        public void koreguoti() throws SQLException, InvalidMenuChoiseExeption {
            System.out.println("Iveskite korteles ID: ");
            String id = input.nextLine();
            System.out.println("Iveskite kliento ID: ");
            String idklientas = input.nextLine();
            System.out.println("Iveskite restorano ID: ");
            String idrestoranas = input.nextLine();
            System.out.println("Iveskite galiojimo laika: ");
            String galiojimo_laikas = input.nextLine();

            KoreguotiKortele koreguoti = new KoreguotiKortele();
            koreguoti.update(id, idklientas, idrestoranas, galiojimo_laikas);
            menu.mainMenu();

        }

        @Override
        public void atnaujinti() throws SQLException, InvalidMenuChoiseExeption {
            com.IS17B.Virmantas.PD1.Lenteles.Kortele.Kortele kortele = new com.IS17B.Virmantas.PD1.Lenteles.Kortele.Kortele();
            Connection con = DuomenuBazesPrisijungimas.getConnection();
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stat.executeQuery("SELECT * FROM kortele");

            kortele.getKortele(rs); //Atspausdina visa sarasa

            menu.mainMenu();
        }
    }
    class Patiekalas implements Menu{

    Scanner input = new Scanner(System.in);
    MainMenu menu = new MainMenu();

    @Override
    public void naujas() throws SQLException, InvalidMenuChoiseExeption {
        System.out.println("Ivekite patiekalo ID: ");
        String id = input.nextLine();
        System.out.println("Ivekite patiekalo pavadinima: ");
        String patiekalas = input.nextLine();
        System.out.println("Ivekite kaina: ");
        String kaina = input.nextLine();
        System.out.println("Ivekite patiekalo tipa: ");
        String tipas = input.nextLine();

        NaujasPatiekalas create = new NaujasPatiekalas();
        create.add(id, patiekalas, kaina, tipas);
        menu.mainMenu();


    }

    @Override
    public void trinti() throws SQLException, InvalidMenuChoiseExeption {
        System.out.println("Iveskite ID kuri norite istrinti");
        String id = input.nextLine();
        IstrintiPatiekala delete = new IstrintiPatiekala();
        delete.eliminate(id);
        menu.mainMenu();
    }

    @Override
    public void koreguoti() throws SQLException, InvalidMenuChoiseExeption {

        System.out.println("Ivekite patiekalo ID: ");
        String id = input.nextLine();
        System.out.println("Ivekite patiekalo pavadinima: ");
        String pavadinimas = input.nextLine();
        System.out.println("Ivekite kaina: ");
        String kaina = input.nextLine();
        System.out.println("Ivekite patiekalo tipa: ");
        String tipas = input.nextLine();

        KoreguotiPatiekala koreguoti = new KoreguotiPatiekala();
        koreguoti.update(id, pavadinimas, kaina, tipas);
        menu.mainMenu();

    }

        @Override
    public void atnaujinti() throws SQLException, InvalidMenuChoiseExeption {
        com.IS17B.Virmantas.PD1.Lenteles.Patiekalas.Patiekalas patiekalas = new  com.IS17B.Virmantas.PD1.Lenteles.Patiekalas.Patiekalas();
        Connection con = DuomenuBazesPrisijungimas.getConnection();
        Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stat.executeQuery("SELECT * FROM patiekalas");

        patiekalas.getPatiekalas(rs); //Atspausdina visa sarasa

        menu.mainMenu();
    }
}

