package oop.generics.generic.genericc;

import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList<T>{

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    public int size =0;

    customArrayList(){
        this.data=new Object[DEFAULT_SIZE];
        // if we use new T[DEFAULT_SIZE], the compiler will not know what it means
        // generics are resolved at compile-time, not run time
        // to solve this issue, we use Object, because we know that every class inherits the object class
        // how did we get this idea? this is how java implements ArrayList internally
    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++]= (Object)(num);
    }

    public boolean isFull(){

        return size == data.length;
    }

    public void resize(){
        Object[] temp=new Object[2* data.length];
        for(int i=0;i< data.length;i++){
            temp[i]= data[i];
        }
        data = temp;
    }

    public T get(int index){

        return (T)(data[index]);
    }

    public void set(int index, int val){
        data[index]=val;
    }

    public T remove(){
        Object removed = data[size];
        size--;
        return (T)(removed);
    }

    @Override
    public String toString() {
        return " " + Arrays.toString(data) + " " + size;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        // integer here is known as the generics
//        // generics help us providing a type such as integer, character etc. (a paramterized type)
//
//
//
//        list.add(32);

        // therefore, we have made our own custom ArrayList, however, the issue is, just like the ArrayList provided to us
        // by java, we cannot make an ArrayList of any object we want to, like we can with in built ArrayList
        // to do that, we must use generics
        customArrayList<A> list=new customArrayList<>();
        for (int i = 0; i < 14; i++) {
            list.add(new A(i));
        }
        System.out.println(list);
    }
}
