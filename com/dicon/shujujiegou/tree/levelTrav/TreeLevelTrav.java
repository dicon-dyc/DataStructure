package com.dicon.shujujiegou.tree.levelTrav;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeLevelTrav {
    public static void main(String[] args) {

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        node1.setNo(1);
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setNo(2);
        node2.setLeft(node4);
        node3.setNo(3);
        node4.setNo(4);
        Tree tree = new Tree(node1);
        tree.levelTral();

    }
}

class Tree{
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void levelTral(){
        if (this.root!=null){
            Queue<Node> queue = new ArrayDeque<Node>();
            queue.add(this.root);
            Node cur = new Node();
            while (!queue.isEmpty()){
                cur = queue.peek();
                System.out.println(cur);
                if (cur.left!=null){
                    queue.add(cur.left);
                }
                if (cur.right!=null){
                    queue.add(cur.right);
                }
                queue.poll();
            }
        }else {
            System.out.println("此二叉树为空！");
        }


    }
}

class Node{
    protected int no;
    protected Node left;
    protected Node right;

    public Node() {

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                '}';
    }
}