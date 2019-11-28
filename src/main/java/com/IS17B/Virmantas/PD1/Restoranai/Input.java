package com.IS17B.Virmantas.PD1.Restoranai;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {

    private static String getInput(String value){
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(value);
        System.out.flush();

        try {
            return buffer.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
    }

    public static int getInt (String value){

        String in = getInput(value);
        return Integer.parseInt(in);
    }
}
