package oop.properties;

public class child extends parent{
    double weight;
    child(){
        this.weight=-1;
        this.length=-1;
        // if length was private, we would'nt be able to access it out of parent class
    }
    child(double l, double w, double h, double weight){
        super(l,w,h); // call the parent class constructor
        // used to initialize values present in parent class
        // this is okay even if length is private bcz child class is not initializing it,
        // parent class is
        this.weight=weight;
    }
}
