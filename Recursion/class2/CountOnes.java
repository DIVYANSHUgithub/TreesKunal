package org.example.Recursion.class2;

public class CountOnes {
    public int count(int num, int count){
        if(num %10== num) return count;
        if(num %10==1 || num%10==-1) return count(num /10,count+1);
        else return  count(num /10,count);
    }
    public static void main(String[] args) {
        int num =-318119321;
        CountOnes co=new CountOnes();
        System.out.println(co.count(num,0));

    }


}
