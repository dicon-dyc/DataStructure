package com.dicon.shujujiegou.tree.BinaryTree;

/**
 * name：二叉树遍历
 * author：dicon
 * date：2021-7-8
 */
public class BinaryTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        Tree tree = new Tree();
        tree.setRoot(root);
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node2.setRight(node4);
        tree.preOrder();
    }
}

class Tree{
    private TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    //前序
    public void preOrder(){
        if (this.root!=null){
            this.root.preOrder();
        }else{
            System.out.println("此二叉树为空。");
        }
    }

    //中序
    public void midOrder(){
        if (this.root!=null){
            this.root.midOrder();
        }else {
            System.out.println("此二叉树为空。");
        }
    }

    //后序
    public void postOrder(){
        if (this.root!=null){
            this.root.postOrder();
        }else{
            System.out.println("此二叉树为空。");
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

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
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

    //前序遍历
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