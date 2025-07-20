package org.example.Recursion.class2;

public class CountZeroes {
    public int count(int num, int count)
    {
        if(num%10==num) return count;
        if(num%10==0)
        {
            return count(num/10, count+1);
        }
        else return count(num/10, count);
    }
    public static void main(String[] args) {
        int a=788040350;
        CountZeroes cz=new CountZeroes();
        System.out.println(cz.count(a,0));
    }
}

