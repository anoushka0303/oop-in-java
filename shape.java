package oop.properties;

public class shape {

    //if we declare this method as final, then it cannot be overridden
    //therefore final keyword can be used to prevent overriding
    // the extra step will be gone when we use the final keyword
    // the java compiler when copying the byte code will know that this method cannot be overridden
    // therefore it is also known as early binding
    // overriding is also known as late binding
    void area(){
        System.out.println("i am in shapes");
    }
}
