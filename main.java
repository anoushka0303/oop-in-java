package oop.accessmodifiers;

public class main {
    public static void main(String[] args) {
        accessModifiers x= new accessModifiers(24,"rooh");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members
        System.out.println((x.name)); // cannot be accessed out of it's class
        // this is data hiding
        // we can do this using getters and setters
        int num = x.getNum();
    }
}
