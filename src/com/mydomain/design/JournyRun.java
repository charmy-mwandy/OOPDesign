package com.mydomain.design;

public class JournyRun implements Journy{
    @Override
    public int Time(int speed, int distance) {

        return distance / speed;
    }

    @Override
    public int Speed(int distance, int time) {
        return distance / time;
    }

    @Override
    public double Distance(int speed, int time) {
        return speed * time;
    }
}
