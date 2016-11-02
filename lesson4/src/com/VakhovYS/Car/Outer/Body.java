package com.VakhovYS.Car.Outer;

/**
 * Created by Adm on 10/31/2016.
 */
public class Body {

    private static final int WHEEL_NUMBER = 4;

    private Color color;
    private Wheel [] wheels;

    public Body(Color color){
        this.color = color;
        this.wheels = new Wheel[WHEEL_NUMBER];

        for(int i=0;i<wheels.length;i++){
            wheels[i] = new Wheel();
        }
    }

    public void move(){
        System.out.println(toString()+ "is mooving"); // получить названия экземпляра
        for(Wheel w :wheels){
            w.rotate();
        }

    }

}
