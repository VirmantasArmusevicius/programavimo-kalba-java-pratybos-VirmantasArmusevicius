package com.IS17B.Virmantas.PD1.GenericClasses;

import com.IS17B.Virmantas.PD1.Anotacijos.DisplayKurejas;
import com.IS17B.Virmantas.PD1.Anotacijos.Kurejas;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TheClass {
    public static void Klase(String[] args){
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
    }
}