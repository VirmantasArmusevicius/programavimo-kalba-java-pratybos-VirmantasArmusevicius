package com.IS17B.Virmantas.PD1.Restoranai;

import com.IS17B.Virmantas.PD1.Anotacijos.DisplayKurejas;
import com.IS17B.Virmantas.PD1.Anotacijos.Kurejas;
import com.IS17B.Virmantas.PD1.GenericClasses.DebugClass;
import com.IS17B.Virmantas.PD1.GenericClasses.TheClass;
import com.IS17B.Virmantas.PD1.Lenteles.Patiekalas.InvalidMenuChoiseExeption;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void mainMenu() throws SQLException, InvalidMenuChoiseExeption {
        Scanner input = new Scanner(System.in);

        System.out.println("Sveiki, Jus esate prijunges prie restoranai duomenu bazes.");
        System.out.println("Spauskite: [1]Restoranai, [2]Darbuotojai, [3]Klientai, [4]Patiekalai, [5]Korteles, [6]Exit, [7]Debug");

        String ats = input.nextLine();
        List<String> GalimiVariantai = Arrays.asList("1","2","3","4","5","6","7");

        if(GalimiVariantai.contains(ats)){

            if (ats.equalsIgnoreCase("1")) {
                System.out.println("Spauskite: [1]Naujas irasas, [2]Istrinti irasa, [3]Koreguoti irasa, [4] Atnaujinti irasu sarasa, [5]Atgal, [6]Sugeneruoti duomenis");
                String ats2 = input.nextLine();

                if (ats2.equalsIgnoreCase("1")) {
                    com.IS17B.Virmantas.PD1.Restoranai.Restoranas retoranas = new com.IS17B.Virmantas.PD1.Restoranai.Restoranas();
                    retoranas.naujas();
                }
                else if(ats2.equalsIgnoreCase("2")){
                    com.IS17B.Virmantas.PD1.Restoranai.Restoranas retoranas = new com.IS17B.Virmantas.PD1.Restoranai.Restoranas();
                    retoranas.trinti();
                }else if(ats2.equalsIgnoreCase("3")){
                    com.IS17B.Virmantas.PD1.Restoranai.Restoranas retoranas = new com.IS17B.Virmantas.PD1.Restoranai.Restoranas();
                    retoranas.koreguoti();
                } else if (ats2.equalsIgnoreCase("4")) {
                    com.IS17B.Virmantas.PD1.Restoranai.Restoranas retoranas = new com.IS17B.Virmantas.PD1.Restoranai.Restoranas();
                    retoranas.atnaujinti();
                } else if (ats2.equalsIgnoreCase("5")) {
                    mainMenu();
                }
                else if (ats2.equalsIgnoreCase("6")) {
                 DataGenerator gen = new DataGenerator();
                 gen.RestoranasDataGenerator();
                }

            }
            else if (ats.equalsIgnoreCase("2")) {
                System.out.println("Spauskite: [1]Naujas irasas, [2]Istrinti irasa, [3]Koreguoti irasa, [4] Atnaujinti irasu sarasa, [5]Atgal, [6]Sugeneruoti Duomenis");
                String ats2 = input.nextLine();

                if (ats2.equalsIgnoreCase("1")) {
                    Darbuotojas darb = new Darbuotojas();
                    darb.naujas();
                }else if(ats2.equalsIgnoreCase("2")){
                    Darbuotojas darb = new Darbuotojas();
                    darb.trinti();
                }else if(ats2.equalsIgnoreCase("3")){
                    Darbuotojas darb = new Darbuotojas();
                    darb.koreguoti();
                } else if (ats2.equalsIgnoreCase("4")) {
                    Darbuotojas darb = new Darbuotojas();
                    darb.atnaujinti();
                } else if (ats2.equalsIgnoreCase("5")) {
                    mainMenu();
                } else if (ats2.equalsIgnoreCase("6")) {
                    DataGenerator gen = new DataGenerator();
                    gen.darbuotojasDataGenerator();
                }
            }

            else if (ats.equalsIgnoreCase("3")) {
                System.out.println("Spauskite: [1]Naujas irasas, [2]Istrinti irasa, [3]Koreguoti irasa, [4] Atnaujinti irasu sarasa, [5]Atgal, [6]Sugeneruoti Duomenis");
                String ats2 = input.nextLine();

                if (ats2.equalsIgnoreCase("1")) {
                    Klientas klientas = new Klientas();
                    klientas.naujas();
                } else if(ats2.equalsIgnoreCase("2")){
                    Klientas klientas = new Klientas();
                    klientas.trinti();
                } else if(ats2.equalsIgnoreCase("3")){
                    Klientas klientas = new Klientas();
                    klientas.koreguoti();
                }else if(ats2.equalsIgnoreCase("4")){
                    Klientas klientas = new Klientas();
                    klientas.atnaujinti();
                } else if (ats2.equalsIgnoreCase("5")) {
                    mainMenu();
                } else if (ats2.equalsIgnoreCase("6")) {
                    DataGenerator gen = new DataGenerator();
                    gen.KlientasDataGenerator();
                }
            }
            else if (ats.equalsIgnoreCase("4")) {
                System.out.println("Spauskite: [1]Naujas irasas, [2]Istrinti irasa, [3]Koreguoti irasa, [4] Atnaujinti irasu sarasa, [5]Atgal");
                String ats2 = input.nextLine();

                if (ats2.equalsIgnoreCase("1")) {
                    Patiekalas patiekalas = new Patiekalas();
                    patiekalas.naujas();
                }else if(ats2.equalsIgnoreCase("2")){
                    Patiekalas patiekalas = new Patiekalas();
                    patiekalas.trinti();
                }else if(ats2.equalsIgnoreCase("3")){
                    Patiekalas patiekalas = new Patiekalas();
                    patiekalas.koreguoti();
                } else if (ats2.equalsIgnoreCase("4")) {
                    Patiekalas patiekalas = new Patiekalas();
                    patiekalas.atnaujinti();
                } else if (ats2.equalsIgnoreCase("5")) {
                    mainMenu();
                }
            }
            else if (ats.equalsIgnoreCase("5")) {
                System.out.println("Spauskite: [1]Naujas irasas, [2]Istrinti irasa, [3]Koreguoti irasa, [4] Atnaujinti irasu sarasa, [5]Atgal");
                String ats2 = input.nextLine();

                if (ats2.equalsIgnoreCase("1")) {
                    Kortele kortele = new Kortele();
                    kortele.naujas();
                }else if(ats2.equalsIgnoreCase("2")){
                    Kortele kortele = new Kortele();
                    kortele.trinti();
                }else if(ats2.equalsIgnoreCase("3")){
                    Kortele kortele = new Kortele();
                    kortele.koreguoti();
                } else if (ats2.equalsIgnoreCase("4")) {
                    Kortele kortele = new Kortele();
                    kortele.atnaujinti();
                } else if (ats2.equalsIgnoreCase("5")) {
                    mainMenu();
                }
            }

            else if(ats.equalsIgnoreCase("6")){
                System.exit(0);
            }
            else if (ats.equalsIgnoreCase("7")){
                try{
                    Class<DisplayKurejas> display = DisplayKurejas.class;
                    Method method = display.getMethod("doSomething", null);
                    Annotation[] annotationArray = method.getAnnotations();
                    for(Annotation annotation : annotationArray) {
                        if(annotation instanceof  Kurejas) {
                            Kurejas kurejas = (Kurejas) annotation;
                            System.out.println("Author: " + kurejas.author() + " Year: " +kurejas.year() + " Version: " +kurejas.version());
                        }
                    }
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                System.out.println("[1]Naudojami Package, [2] Package numeriai");
                String ats2 = input.nextLine();
                if (ats2.equalsIgnoreCase("1")) {
                    DebugClass debugClass = new DebugClass();
                    debugClass.Lists();
                }else if(ats2.equalsIgnoreCase("2")){
                    Kortele kortele = new Kortele();
                    kortele.trinti();
                }

            }

            else{
                System.exit(0);
            }

        }
        else{
            throw new InvalidMenuChoiseExeption("Ivedete netinkama varianta, meginkite ivesti skaiciu nuo 1 iki 6");
        }
    }
}
