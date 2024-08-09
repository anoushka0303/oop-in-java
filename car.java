package oop.interfaces;

public class car implements engine,brake,media {

    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void start() {
        System.out.println("engine start");
    }

    @Override
    public void stop() {
        System.out.println("engine stop");
    }

    @Override
    public void acc() {
        System.out.println("acc");
    }
}
