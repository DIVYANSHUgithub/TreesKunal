package org.example.Recursion.class2;

public class factorial {
    public static void main(String[] args) {
        factorial f=new factorial();
        f.factorialNum(10);
    }
    public int factorialNum(int n){
         if(n==0) return 1;
        int m=n*factorialNum(n-1);
        System.out.println(m);
        return m;
    }
}
