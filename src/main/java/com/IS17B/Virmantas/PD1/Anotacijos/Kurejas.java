package com.IS17B.Virmantas.PD1.Anotacijos;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface Kurejas {
    public String author();
    public String year();
    public String version();
}

