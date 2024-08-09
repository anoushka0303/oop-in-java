package oop.generics.generic.exceptionHandling;

public class exceptionHandling {
    // exception is something that breaks the entire flow of the program
    // there is a difference between error and exception
    // e.g.: stack overflow is an exception not an error

    // java has a class which handles all the exceptions and stuff : it is known as the Throwable class
    // Object class -> inherited by Throwable class -> inherited by exception class and error class
    // exceptions are of two types : checked and not checked
    // checked exceptions are the ones that are check during compile time
    // unchecked exceptions are the ones that are checked onces the program start running
    // therefore, they are called run time exceptions
    //Exception ArithmeticException;
    public static void main(String[] args) {
        int a= 5;
        int b= 0;
        // int c= a/b will throw arithematic exception
        // therefore, we will use try catch block to catch the exception
        try{
            divind(a,b);
        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            // no matter what happens, this will always execute
            System.out.println("i am in finally block");
        }
    }

    // throws is used to declare exceptions while throw is used to throw an exception
    //
    static int divind(int a, int b) throws ArithmeticException{
        //Exception ArithmeticException;
        if(b == 0){

            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
