package oop.properties;

public class parent {
    double length;
    double height;
    double width;

    // super keyword can be used as the this keyword, except it will only initialize the
    // objects that are there in parents class
    // the purpose of super keyword is suppose if both parent and child class have the same
    // variable "int x" then this.x will get confused about which variable it has to access
    // therefore super.x can specify that we want to access variable from the parent class


    // types of inheritance:
    // 1. single inheritance : one class extends another class
    // 2. multi-level inheritance: parent is super class of child and the derived class i.e.
    //    child becomes parent for another class e.g.: a extends b and c extends a
    // 3. multiple inheritance : when one class extends more than one classes e.g.: a extends b
    //    and a extends c. this is not supported by java but it can be implemented using what we
    //    call interfaces
    // 4. hierarchial inheritance : onr class is inherited by multiple classes. e.g.:
    //    a extends x, b extends x, c extends x and so on...
    // 5. hybrid inheritance : combination of single and multiple inheritance
    //    (not in java)(happens in interface)
    // to prevent a class from getting inherited : we can declare it as final



    // polymorphism : many ways to represent single entity or item
    // if no polymorphism is supported by language, it is known as object basis language instead
    // of object oriented language
    // when does it occur? it occurs during inheritance
    // static methods are not overridden as the method from the parent class will be called/run
    // no matter which object you call it from as it is static
    // you can inherit but cannot override


    // encapsulation : wrapping up the implementation of data members and methods in a class
    // so that it can be protected from the outer world
    // solving an implementation level issue
    // process of containing information
    // hiding data using getters and setters
    // data hiding -> focuses on the security; encapsulation -> focuses on hiding the complexity of the code


    // abstraction : hiding unecessary details but showing valuable information
    // its a design issue
    // process of gaining information
    parent(){
        //super(); // every object is inherited from the Object class
        this.length=-1;
        this.height=-1;
        this.width=-1;
    }
    parent(double s){
        this.length=s;
        this.height=s;
        this.width=s;
    }
    parent(double l, double w, double h){
        this.length=l;
        this.width=w;
        this.height=h;
    }
    parent(parent old){
        this.length=old.length;
        this.width=old.width;
        this.height=old.height;
    }
    public void info(){
        System.out.println("running the box");
    }
}
