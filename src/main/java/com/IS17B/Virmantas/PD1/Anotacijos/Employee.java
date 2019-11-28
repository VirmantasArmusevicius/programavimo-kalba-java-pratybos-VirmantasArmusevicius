package com.IS17B.Virmantas.PD1.Anotacijos;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Employee {
    int id() default 0;
    int idDarboVieta() default 0;
    String name() default "Vardenis";
    String lastname() default "Pavardenis";
    String job() default "Padavejas";
    float alga() default 550;
}
