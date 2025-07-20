package org.example.Recursion;


import java.util.HashMap;

public class LinearSearch {
    public Boolean isPresent(int[] array, int target, int i)
    {
        if(array.length==i) return false;
        if(array[i]== target) return true;
        return isPresent(array, target, i+1);
    }
    public static void main(String[] args) {
        int[] array={8,10,12,13,22,-98,73};
        int target=-98;
        LinearSearch ls=new LinearSearch();
        System.out.println(ls.isPresent(array, target,0));
        HashMap<Character, Integer> hash=new HashMap<>();
    }
}
