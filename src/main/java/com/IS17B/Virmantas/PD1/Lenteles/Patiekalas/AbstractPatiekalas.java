package com.IS17B.Virmantas.PD1.Lenteles.Patiekalas;

 public abstract class AbstractPatiekalas {
     private String type;

     public abstract void meal();

     public abstract void soup();

     public abstract void drink();

     public String getType() {
         return type;
     }

     public void setType(String type){
         this.type = type;
     }
 }

