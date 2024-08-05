package oop.accessmodifiers;

public class ObjectDemo {

    int num;
    ObjectDemo(int num){
        this.num =num;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
        // gives a number representation of an obejct
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(34);
        System.out.println(obj instanceof ObjectDemo);
    }
}
