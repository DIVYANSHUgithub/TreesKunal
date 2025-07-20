package org.example.Trees.SegmentTrees;

public class SegmentTree {
    private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
        public Node(int startInterval, int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;

        }
    }
    public Node root;
    public SegmentTree(int[] array)
    {
        this.root=constructTree(array,0,array.length-1);
    }
    public Node constructTree(int[] array, int start, int end){
        if(start==end){
            Node leaf=new Node(start, end);
            leaf.data=array[start];
            return leaf;
        }
        Node node=new Node(start, end);
        int mid=(start+end)/2;
        node.left=this.constructTree(array, start, mid);
        node.right=this.constructTree(array, mid+1, end);
        node.data=node.left.data+node.right.data;
        return node;
    }
    public void display(){
        display(this.root);
    }
    public void display(Node node){
        
    }
//    public void insert(Node node, int data, int start, int end){
//        insert(node, data, start, end);
//    }
//    public void insert(Node node, int data, int start, int end){
//        node.data=data;
//        node.endInterval=end;
//        node.startInterval=start;
//    }
//    public void populate(int[] array, int i){
//        populate(root, array, i);
//    }
//    private void  populate(Node node, int[] array, int i){
//        if(node.data<array[i]){
//
//            Node right;
//
//        }
//
//    }

    public static void main(String[] args) {

        int[] array={3,8,7,6,-1,-8,4,9};
        SegmentTree tree=new SegmentTree(array);

    }

}
