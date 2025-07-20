package org.example.Recursion.class2;



public class ReverseNumber {
    public static void main(String[] args) {
        int n=9559559;
        ReverseNumber pn=new ReverseNumber();

        System.out.println(pn.reverse(n));
        System.out.println(pn.palindrome(n));


    }
    public int reverse(int n){
        int digit=(int)Math.log10(n)+1;
        return helper(n, digit);
    }

    public Boolean palindrome(int num)
    {
        return reverse(num)==num  ;

    }

    public int helper(int n, int digit){
        if(n%10==n)return n;
        int rem=n%10;
        return rem*(int)(Math.pow(10,digit-1)) +helper(n/10, digit-1);
    }
}
