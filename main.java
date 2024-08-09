package oop.interfaces;

public class main {
    public static void main(String[] args) {
//        car car=new car();
//        car.acc();
//        car.brake();
//        car.start();
//        car.stop();
//
//        media carmedia=new car();
//        carmedia.start();
        // trying to start the music player but the engine start bcz both engine and media
        // interfaces have the same method names called start and stop
        // how to solve this?
        // we can create different classes for engine and media player

        niceCar car=new niceCar(new PowerEngine());
        car.start();
        car.stop();
        car.updateEngine();
        car.startMedia();
        car.start();
        car.stop();
        car.stopMedia();
    }
}
