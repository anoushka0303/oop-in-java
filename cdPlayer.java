package oop.interfaces;

public class cdPlayer implements media{
    @Override
    public void start() {
        System.out.println("music started");
    }

    @Override
    public void stop() {
        System.out.println("music stopped");
    }
}
