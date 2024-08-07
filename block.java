package staticExample;

// demo to show initialization of static variables
public class block {
    static int a = 4;
    static int b;

    // we want to do some work to initialize "b"
    // it can be done via static block and that static block will be used only once when
    // the class is first loaded
    // will only run once when the first object is created
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        block bs=new block();
        // as soon as this class is loaded, all the static elements will run first
        System.out.println(bs.a + " " + bs.b);
    }
}

