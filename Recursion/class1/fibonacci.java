package org.example.Recursion.class1;

public class fibonacci {
    public static void main(String[] args) {
        int num=50;
        fibonacci ne=new fibonacci();

        int m=ne.fibo(num);
        System.out.println(m);
    }
    public int fibo( int num)
    {
        if(num<2)
        {
            System.out.println(num);
            return num;
        }

        int m=fibo(num-1)+fibo(num-2);
        System.out.println(m);
        return m;
    }

}
