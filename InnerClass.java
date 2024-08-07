package staticExample;


// outside classes cannot be static i.e. the main class cannot be static
// static varibales/methods/classes are resolved during compile time as they do not have
// anything to do with objects which are resolved during runtime
public class InnerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("a");
        Test b=new Test("b");
        // both of these are givng a error bcz test class is non static
        // test claas itself is dependent on the innerclass class
        // every instance of InnerClass will have Test as it's instance
        // if we make Test class static, then it is not dependent on the objects of InnerClass
        System.out.println(a.name);
        System.out.println(b.name);
        // a.name and b.name have their own identities bcz main and test can depend on each other
        // the static just means that any object of test is not dependent on innerclass
        System.out.println();
        // System -> class; out-> variable; println -> method

    }
}
