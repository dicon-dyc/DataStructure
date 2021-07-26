package com.dicon.shujujiegou.linklist.delNode;

public class delNode {
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){this.val = x;}

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

class delLinklist{
    public ListNode root = null;
    public delLinklist() {
    }

    public void add(ListNode node){
        ListNode tmp = root;
        while (true){
            if (tmp.next==null){
                tmp.next = node;
                break;
            }else {
                tmp = tmp.next;
            }
        }
    }

    public void show(){
        ListNode tmp = root;
        while (true){
            if (tmp!=null){
                System.out.println(tmp);
                tmp = tmp.next;
            }else{
                break;
            }
        }
    }

    public  ListNode deletedNode(int val){

        if (root.val == val){return root;}
        ListNode tmp = root;
        ListNode flag = root;
        while (true){
            if (tmp!=null){
                if (tmp.val == val){
                    flag.next = tmp.next;
                    break;
                }else {
                    flag = tmp;
                    tmp = tmp.next;
                }
            }else {
                break;
            }
        }
        return root;
    }
}