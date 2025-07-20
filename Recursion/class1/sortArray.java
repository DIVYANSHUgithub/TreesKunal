package org.example.Recursion.class1;

public class sortArray {
    public static void main(String[] args) {
        sortArray as=new sortArray();
        as.print(5);
    }
    public void print(int num){
        if(num==0) return;
        print(num-1);
        System.out.println(num);
    }
}
