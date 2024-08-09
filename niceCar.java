package oop.interfaces;

public class niceCar {
    private engine eg;
    private media player=new cdPlayer();

    public niceCar() {
        this.eg = new electricEngine();
    }

    public niceCar(engine eg) {
        this.eg = eg;
    }

    public void updateEngine(){
        this.eg=new PowerEngine();
    }

    public void start(){
        eg.start();
    }

    public void stop(){
        eg.stop();
    }

    public void startMedia(){
        player.start();
    }

    public void stopMedia(){
        player.stop();
    }
}
