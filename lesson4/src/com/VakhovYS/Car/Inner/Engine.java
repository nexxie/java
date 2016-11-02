package com.VakhovYS.Car.Inner;

/**
 * Created by Adm on 10/31/2016.
 */
public class Engine {
    private Integer rpm;
    private Cylender[] cylenders;


    public Engine(int count) {
        this.cylenders = new Cylender[count];
        for(int i= 0; i<cylenders.length;i++){
            cylenders[i] = new Cylender();
        }

    }


    public boolean checkWorking() {
        if (rpm != null && rpm > 0) {
            for(Cylender c: cylenders)
            c.work();
            return true;
        }
        return false;
    }

    public boolean start() {
        if (!checkWorking()) {
            this.rpm = (int) (Math.random() * 8001);
            return checkWorking();
        }
        return false;
    }

    public void stop() {
        System.out.println();
        this.rpm = 0;
    }
}

