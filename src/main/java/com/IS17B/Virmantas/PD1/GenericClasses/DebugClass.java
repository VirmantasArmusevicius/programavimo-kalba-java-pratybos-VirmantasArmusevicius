package com.IS17B.Virmantas.PD1.GenericClasses;

import com.IS17B.Virmantas.PD1.Lenteles.Darbuotojas.Darbuotojas;

import java.util.*;

public class DebugClass {
    public void Lists() //esami Package
    {
        List<Pakuotes> packageList = new ArrayList<>(Arrays.asList(
                new Pakuotes("Darbuotojas",2),
                new Pakuotes("Restoranas", 1),
                new Pakuotes("Korteles",5),
                new Pakuotes("Klientai", 3),
                new Pakuotes("Patiekalai", 4)
        ));

        List<Integer> packageNumber = new ArrayList<Integer>();
        packageNumber.add(5); //Korteles
        packageNumber.add(2); //Darbuotojai
        packageNumber.add(3); //Klientai
        packageNumber.add(4); //Patiekalai
        packageNumber.add(1); //Restoranas

        /*System.out.printf("Number: %d\n", packageNumber.get(0));
        System.out.printf("Pavadinimas: %s\n", packageList.get(0));*/

        Collections.sort(packageList, new Comparator<Pakuotes>() {
            @Override
            public int compare(Pakuotes o1, Pakuotes o2) {
                return o1.getNumeris() - o2.getNumeris();
            }
        });
        System.out.println(packageList);
       /* Iterator<Integer> integerIterator = packageNumber.iterator();
        while (integerIterator.hasNext()){
            System.out.printf("Numeris: %s\n", integerIterator.next());
        }*/

    }
}