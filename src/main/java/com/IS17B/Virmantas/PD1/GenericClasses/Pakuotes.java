package com.IS17B.Virmantas.PD1.GenericClasses;

 class Pakuotes {
    private String pavadinimas;
    private Integer numeris;

    private  Pakuotes(String pavadinimas, Integer numeris){
        this.pavadinimas = pavadinimas;
        this.numeris = numeris;
    }
    @Override
    public String toString(){
        return "{" + "Pavadinimas='" + pavadinimas + '\'' +", Numeris=" + numeris +'}';
    }

    public String getPavadinimas(){
        return pavadinimas;
    }

    private Integer getNumeris(){
        return numeris;
    }
}
