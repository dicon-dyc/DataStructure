package com.dicon.shujujiegou.tree.test.tree;

public class binaryTree {
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        Tree tree = new Tree(node1);
        node1.setLeft(node2);
        node1.setRight(node3);
        tree.preOrder();
        System.out.println("--------------");
        tree.midOrder();
        System.out.println("--------------");
        tree.postOder();

    }
}

class Tree{
    private TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void preOrder(){
        if (this.root!=null)
        this.root.preOrder();
    }

    public void midOrder(){
        if (this.root!=null){
            this.root.midOrder();
        }
    }

    public void postOder(){
        if (this.root!=null){
            this.root.postOrder();
        }
    }
}

class TreeNode{
    private int numb;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int numb) {
        this.numb = numb;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "numb=" + numb +
                '}';
    }

    //先序
    public void preOrder(){
        System.out.println(this);
        if (this.left!=null){
            this.left.preOrder();
        }
        if (this.right!=null){
            this.right.preOrder();
        }
    }

    //中序
    public void midOrder(){
        if (this.left!=null){
            this.left.midOrder();
        }
        System.out.println(this);
        if (this.right!=null){
            this.right.midOrder();
        }
    }

    //后序
    public void postOrder(){
        if (this.left!=null){
            this.left.postOrder();
        }
        if (this.right!=null){
            this.right.postOrder();
        }
        System.out.println(this);
    }
}