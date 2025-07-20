package org.example.Recursion.class1;

public class ProductNumber {
    public static void main(String[] args) {
        int n=9859;
        ProductNumber pn=new ProductNumber();
        int prod=pn.product(n);
        System.out.println(prod);
    }
    public int product(int n)
    {
        if(n%10==n) return n;
        return n%10 * product(n/10);
    }
}
