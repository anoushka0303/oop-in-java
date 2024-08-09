package oop.properties;

public class circle extends shape{


    // this will run when object of circle class is being created
    // hence it is overriding the area method of parent class which is shapes
    @Override // annotations
    // if annotation is giving error then it is not true
    void area(){
        System.out.println("i am in circle");
    }
}
