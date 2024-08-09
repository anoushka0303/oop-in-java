package oop.properties;

public class objectPrint {


    int num;
    objectPrint(int num){
        this.num=num;
    }
    @Override
    public String toString(){
        return " " + num;
    }
    public static void main(String[] args) {
        objectPrint obj=new objectPrint(123);
        System.out.println(obj);
        // this will give a hashcode value + package name bcz that is the default toString()
        // method. for the num to print we need to override the default toString() method
    }
}
