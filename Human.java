package staticExample;

public class Human {
    int age;
    String name;
    int sal;
    boolean isMarried;
    static long pop;
    static void message(){
        System.out.println("hello world");
        //System.out.println(this.age);//cannot be used bcz this.age refers to an object
    }
    public Human(int age, String name, int sal, boolean isMarried){
        this.name=name;
        this.sal=sal;
        this.age=age;
        this.isMarried=isMarried;
        Human.pop += 1;
        // should not be using this keyword because the pop variable is common for all
        // for eg: if we're creating human obj of Human class it'd be replaced with
        // human.pop, which is not correct terminology because the population is of the entire
        //class
        // if a member is declared as static, it can be accessed before any object of the class
        // is being made and without referencing to the object
        // static variables can be used without the objects being created
        // why is main declared as static?
        // we can create the main method without creating any object of that class and main
        // method is the first method which is run in a java program
        // how can we run the program to create an object when main is the very first thing
        // that is running, hence you should be able to run main withouth creating an object of the class
        // main
    }
}
