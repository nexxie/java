package com.VakhovYS.Car;

import com.VakhovYS.Car.Inner.Engine;
import com.VakhovYS.Car.Outer.Body;

/**
 * Created by Adm on 10/31/2016.
 */
public class Car {

    public Car(Engine engine, Body body) {
        this.engine = engine;
        this.body = body;
    }

    private Engine engine;
    private Body body;

    public void move(){
        while(engine.checkWorking()){
            engine.start();
        }

        body.move();
        engine.stop();
    }
}
