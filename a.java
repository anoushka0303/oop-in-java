import java.lang.Override;
import java.lang.System;
import java.lang.Throwable;

public class a {
    public static void a(){
        System.out.println("hello");
    }
    /*@Override
    // the garbage collector of java is called automatically when there is a memory which
    // hasnt been used and is taking up space. the "finalize()" method is called when
    // the gc is called, and its function is to send a message when the gc is called
    // automatically
    protected void finalize() throws Throwable {
        System.out.println("object deleted");
    }*/
}
