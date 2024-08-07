package staticExample;

public class Main {
    public static void main(String[] args){
        Human human=new Human(21,"anoushka",0,false);
        Human human2=new Human(30,"martin",0,true);
        // what is there was a property that was common to all the "Human" objects?
        //e.g.: population
        //the population is not directly related to the object, it is independent
        //those properties ehich are not direct related to the object are called static varibales
        // or static methods
        System.out.println(Human.pop);
        System.out.println(Human.pop);
        // "human2.pop" would also have worked
        // the result is wrong, it should be bcz there are two humans
        //greeting();
        // showing an error when greeting method is not declared static
        // this is because we cannot use anything non static in a static method
        // why? something that is not static belongs to an object
        // non static -> will have an instance, while static will not
        // without resolving which instance of the object we're talking about, we therefore
        //cannot use a non static method
        Main obj=new Main();
        obj.greeting();
        //this works even though greeting is a non static method because we created an
        //instance of the main class
        // greeting needed an object to be run and now an object is created
    }
    void greeting(){
        System.out.println("hello world");
    }
    /*@Override
    protected void finalize() throws Throwable {
        super.finalize();
    }*/
}
