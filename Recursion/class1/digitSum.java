package org.example.Recursion.class1;

public class digitSum {
    public static void main(String[] args) {
        int n=555;
        digitSum ds=new digitSum();
        int m=ds.sum(n);
        System.out.println(m);
    }
    public int sum(int n){
        if(n%10==n) return n;
        return n%10 + sum(n/10);
    }
}
