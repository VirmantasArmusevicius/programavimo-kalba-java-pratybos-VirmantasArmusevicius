package com.IS17B.Virmantas.PD1.Anotacijos;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConfigureEmployee {
    int id() default 0;
    int idDarboVieta() default 0;
    String name() default "Vardenis";
    String lastname() default "Pavardenis";
    String b() default "Padavejas";
    float alga() default 550;
}
