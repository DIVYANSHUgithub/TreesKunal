package org.example.Recursion;

public class SortedArray {
    public Boolean isSorted(int[] array, int i){
        if(i==array.length-1) return true;
        if(array[i]<=array[i+1]) return isSorted(array, i+1);
        return false;
    }
    public static void main(String[] args) {
        int[] array={1,3,2,14,23,48};
        SortedArray sa=new SortedArray();
        System.out.println(sa.isSorted(array,0));
    }

}
