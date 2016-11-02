package com.VakhovYS;

import com.VakhovYS.Car.Car;
import com.VakhovYS.Car.Inner.Engine;
import com.VakhovYS.Car.Outer.Body;
import com.VakhovYS.Car.Outer.Color;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Engine engine = new Engine(8);
        Body body = new Body(new Color(0xfffff, Color.TYPE.METALIC));
        Car car = new Car(engine,body);

        car.move();


    }
}
