package com.VakhovYS.Car.Outer;

/**
 * Created by Adm on 10/31/2016.
 */
public class Color {



    public Color(int value, TYPE type) {
        this.value = value;
        this.type = type;
    }
    public enum TYPE {

    METALIC,
    NO_METALIC;
    }

    private final int value;
    private final TYPE type;


}
