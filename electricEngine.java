package oop.interfaces;

public class electricEngine implements engine{
    @Override
    public void start() {
        System.out.println("electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("electric engine accelerated");
    }
}
