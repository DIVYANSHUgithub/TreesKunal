package org.example.Recursion.class1;



public class BinarySearch {
    public static void main(String[] args) {

        int[] array={1,2,6,8,47,55,57,98,99};
        int target=6;
        BinarySearch bs=new BinarySearch();
        int p=bs.binarySearch(array,target,0, array.length-1);
        System.out.println(p);
    }
    public int binarySearch(int[] array, int target, int start, int end)
    {

        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(array[mid]==target)
        {
            return mid;
        }
        if(array[mid]>target)
        {
            return binarySearch(array, target, 0,mid-1);
        }
        return binarySearch(array, target, mid+1, array.length);

    }
}
