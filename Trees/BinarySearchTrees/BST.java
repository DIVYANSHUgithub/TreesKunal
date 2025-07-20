package org.example.Trees.BinarySearchTrees;

public class BST {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;
        public Node (int value){
            this.value=value;

        }
        public int getValue(){
            return value;
        }
        public int getHeight(Node node){
            if(node==null){
                return -1;
            }
            return this.height;
        }
    }
    private Node root;
    public BST(){

    }
//    public int height(Node node){
//        if(node==null){
//            return -1;
//        }
//        return node.height;
//    }

    // isEmpty checking method
    public boolean isEmpty(Node node){
        return root==null;
    }



    // insert function
    public void insert(int value){
        root=insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node==null){

            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value> node.value){
            node.right=insert(value, node.right);
        }
        node.height=Math.max(node.getHeight(node.left), node.getHeight(node.right))+1;
        return node;
    }



    // populating means inserting
    public void populate(int[] nums){
        for(int i=0; i<nums.length; i++){
            insert(nums[i]);
        }
    }
    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }
    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }


    // balancing
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null) return true;
        return Math.abs(node.getHeight(node.left)-node.getHeight(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }



    // display
    public void display(){
        display(this.root, "Root Node:");
    }
    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+ node.getValue());
        display(node.left, "Left Child of" + node.getValue()+" : ");
        display(node.right, "right Child of" + node.getValue()+" : ");
    }





    // Traversals

    public void inorder(){
        inorder(root, "root node is : ");
        System.out.println();
    }
    private void inorder(Node node, String details){
        if(node==null) return;
        inorder(node.left, "left Node of : "+node.value+" is : ");
        System.out.print(node.value+" ");
        inorder(node.right, "right Node of"+node.value+" is : ");
    }


    public void preorder(){
        preorder(root, "root node is : ");
        System.out.println();
    }
    private void preorder(Node node, String details){
        if(node==null) return;
        System.out.print( node.value+" ");
        preorder(node.left, "left Node of "+node.value+ " is : ");
        preorder(node.right, "right Node of "+ node.value+ " is : ");

    }

    public void postorder(){
        postorder(root, "root node is : ");
        System.out.println();
    }
    private void postorder(Node node, String details){
        if(node==null) return;
        postorder(node.left, "left node of " + node.value+ " is : ");
        postorder(node.right, "right node of " + node.value+ " is: ");
        System.out.print(node.value+" ");
    }

    public static void main(String[] args) {
        BST tree=new BST();
        int[] array={5,2,7,1,4,6,9,8,3,10};
        tree.populate(array);
        //tree.display();
        tree.preorder();
        tree.inorder();
        tree.postorder();
    }
}
