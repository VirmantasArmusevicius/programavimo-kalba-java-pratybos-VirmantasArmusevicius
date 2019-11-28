package com.IS17B.Virmantas.PD1.Anotacijos;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Explanation {
    String explain();
}
