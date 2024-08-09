package oop.interfaces;

// we can use multiple inheritance using interfaces
// all the methods in an interface are abstract, therefore, variables in an interface needs to
// be declared as final and static bcz it's object cannot be created and it's constructor cannot
// be created and therefore it cannot has to be initialized usong final and static keywords
// static -> bcz objects cannot be created
public interface engine {
    static final int price=78000;
    //any interface variable must be static and final bcz interface variables cannot be
    //instantiated on their own


    void start();
    void stop();
    void acc();
}
