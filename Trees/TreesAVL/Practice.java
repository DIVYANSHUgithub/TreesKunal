package org.example.Trees.TreesAVL;


import org.example.Trees.BinaryTrees.BinaryTree;

public class Practice {
    private  class Node{
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value)
        {
            this.value=value;
        }
    }
    public Node root;
    public int height()
    {

        return height(root);
    }
    public int height(Node node)
    {
        if(node==null)
        {
            return -1;
        }
        return node.height;
    }


    public void insert(int value){
        root=insert(value,root);
    }
    private Node insert(int value,Node node){

        if(node==null)
        {
            node=new Node(value);
            return node;
        }
        if(value<node.value){

            node.left=insert(value,node.left);

        }
        if(value>node.value)
        {
            node.right=insert(value,node.right);

        }
        node.height=Math.max(height(node.left), height(node.right))+1;

        return rotate(node);
    }
    private Node rotate(Node node)
    {

        if(height(node.left)-height(node.right)>1)
        {
            // left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                return right(node);
            }
            // left-right heavy
            if(height(node.left.left)-height(node.left.right)<0)
            {
                node.left=left(node.left);
                return right(node);
            }
        }

        if(height(node.left)-height(node.right)<-1) {
            // right heavy
            if(height(node.right.left)-height(node.right.right)<0)
            {
                return left(node);
            }
            // right-left heavy
            if(height(node.right.left)-height(node.right.right)>0)
            {
                node.right=right(node.right);
                return left(node);
            }
        }
        return node;

    }
    public Node right(Node p){
        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;
    }
    public Node left(Node c){
        Node p=c.right;
        Node t=p.left;

        p.left=c;
        c.right=t;
        p.height=Math.max(height(p.left),height(p.right))+1;

        c.height=Math.max(height(c.left),height(c.right)+1);
        return p;
    }
    public void populate(int[] nums){
        for(int i=0; i<nums.length; i++){
            insert(nums[i]);
        }
    }
    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        Practice practice=new Practice();
        int[] array={15,8,5,6,9,18,17,22,19};
        practice.populate(array);
        //practice.display();
        practice.prettyDisplay();
    }
}
