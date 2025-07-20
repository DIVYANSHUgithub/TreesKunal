package org.example.Recursion;

import java.math.MathContext;
import java.net.http.HttpClient;
import java.util.Arrays;
import java.util.Stack;

public class RotatedBinarySeearch {
    public static void main(String[] args) {
        int a=5;
        //System.out.println(a);
        Stack<Integer> stack=new Stack<>();
        int max=Integer.MIN_VALUE;
        stack.push(4);
        stack.push(5);
        //System.out.println(stack);
        //System.out.println(stack.firstElement());
        //stack.removeFirst();
        //stack.pop();
        //System.out.println(stack.lastElement());
        int[] nums={8};
        int[] nums2=new int[4];
        nums2[0]=1;
        nums2[1]=2;
        nums2[2]=3;
        nums2[3]=4;
        //nums=null;
        //System.out.println(nums2[3]);
        //nums2=null;
        //System.out.println(nums2);
        //System.out.println(Arrays.equals(nums,nums2));
        System.out.println(StrictMath.hypot(8,8));
        //System.out.println(nums.length);

        
        //HttpClient client=HttpClient.newHttpClient();
        //Math;
        while(stack.size()>0 &&stack.lastElement()<nums[0])
        {
            stack.pop();
        }

        //stack.getFirst();
        //stack.getLast();
        //System.out.println(stack);
        //System.out.println(stack.push(8));
    }
}