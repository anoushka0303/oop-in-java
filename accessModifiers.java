package oop.accessmodifiers;

public class accessModifiers {
    protected int num; // we do not want anyone else to access this element
    // when there is no access modifier mentioned, the default one
    // allows the data member or method to be used within the same package but
    // not in outside of it's package

    // public : can be accessed int the same class, package, subclass(same package), subclass
    //          (different package), world(different package, not subclass)

    // private : can be accessed only in the same class

    // protected : can be accessed in the same class, package, subclass(same package), subclass
    //             (different package)

    // default/ no access modifier : can be accessed in the same class, package and subclass
    //                               (same package) and not in subclass (different package)
    String name;
    int[] arr;

    public accessModifiers(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }

    public int getNum(){
        return num;
    }
}
