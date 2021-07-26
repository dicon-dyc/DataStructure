package com.dicon.shujujiegou.linklist.revlinklist;

import javax.swing.plaf.IconUIResource;
import java.net.CacheRequest;

public class revLinklist {

    public static void main(String[] args) {

        HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3 = new HeroNode(3,"吴用","智多星");
        HeroNode hero4 = new HeroNode(4,"林冲","豹子头");

        linkList list1 = new linkList();
        list1.add(hero1);
        list1.add(hero2);
        list1.add(hero3);
        list1.add(hero4);

        //list1.show();

        list1.rever();
        list1.show();
    }
}

class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

class linkList{

    public HeroNode root = new HeroNode(0,"","");

    public linkList() {
    }

    public void show(){

        HeroNode tmp = root;
        if (tmp.next == null){
            System.out.println("此链表为空！");
        }
        else {
            while (tmp.next!=null){
                tmp = tmp.next;
                System.out.println(tmp);
            }
        }
    }

    public void add(HeroNode node){
        HeroNode tmp = root;
        while(tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    public void rever(){
        HeroNode tmp = root;
        HeroNode secondRoot = null;
        while (true){
            if (tmp!=null){
                HeroNode secondTmp = tmp.next;
                tmp.next = secondRoot;
                secondRoot = tmp;
                tmp = secondTmp;
            }else {
                break;
            }
        }
        root = secondRoot;
    }

}