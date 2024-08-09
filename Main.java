package oop.properties;

public class Main {
    // four fundamental properties of oop are :
    // 1. inheritance 2. abstraction 3. polymorphism 4. encapsulation
    // inheritance : the child class inherits properties from base class
    public static void main(String[] args) {
        // inheritance
        parent p1=new parent();
        System.out.println((p1.length));
        parent p2=new child(1,2,3,4);
        System.out.println(p2.width);
        //even if weight is initialized, it is not able to access it
        //it is the type of the reference variable and not the object that determins what
        //properties can be accessed
        //when a reference of a sub class object is assigned to a super class variable
        //you will have access to only those parts which are accessable to super class
        // the opposite cannot be done as parent class has no idea about the properties of
        // child class

        // polymorphism
        // type 1 : compile time or static polymorphism : method overloading
        //          when the class has multiple methods of the same name but the no. type
        //          and order of parameters are different. java determines which method or constructor
        //          will be called at compile time
        // type 2 : run time or dynamic polymorphism : method overriding
        //
        shape sh=new shape();
        circle cir=new circle();
        square sq=new square();
        shape square=new square();
        square.area(); // since the area method of shape is overriden by the area method of
        // of square therefore, the area method of square is printed
        // it depends on what type of object it is
        // Parent obj=new Child(); -> here, the method which will be called depends on the type oof object and this is known as up-casting
        // this is how overriding works
        // how does java determine this? by something known as dynamic method dispatch
        // it is a method by which a call to an overridden method is resolved at runtime rather than compile time

    }
}