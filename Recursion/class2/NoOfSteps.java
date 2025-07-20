package org.example.Recursion.class2;

public class NoOfSteps {
    public static void main(String[] args) {
        NoOfSteps ns=new NoOfSteps();
        int num=21982;
        System.out.println(ns.helper(num,0));
    }
    public int helper(int num, int count)
    {
        if(num ==0) return count;
        if(num %2==0) return helper(num /2, count+1);
        else return helper(num -1, count+1);
    }
}
