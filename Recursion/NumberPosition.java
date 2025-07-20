package org.example.Recursion;

import java.util.ArrayList;

import java.lang.invoke.TypeDescriptor.OfMethod;
interface ClassLoader
{
    public static void main(String[] args) {
        java.lang.ClassLoader st;

    }

}
class B implements ClassLoader{
    ClassLoader c=new B();

    //public void setC();
}
public  class NumberPosition {
    // we can't override static methods

    public static void main() {
        main(4);
    }

    public static void main(int args) {
        int[] array={0,2,3,4,4,8};
        int  target=4;
        NumberPosition np=new NumberPosition();
        //ArrayList<Integer> list=new ArrayList<>();
        //System.out.println(np.valueCount(array,target,0,list));
        System.out.println(np.valueCount2(array,target,0));
    }
    public ArrayList<Integer> valueCount(int[] array, int target, int i, ArrayList<Integer> list){
        if(i==array.length) return list;
        if(array[i]==target) list.add(i);
        return valueCount(array,target,i+1, list);
    }

    // without passing list in argument
    public ArrayList<Integer> valueCount2(int[] array, int target, int i){
        ArrayList<Integer> list=new ArrayList<>();
        if(i==array.length) return list;
        if(array[i]==target) list.add(i);
        ArrayList<Integer> answer=valueCount2(array, target, i + 1);
        if(!list.isEmpty());
        {
            answer.addAll(list);
        }
        return answer;
    }
}
