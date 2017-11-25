package com.mst_prim;

import java.util.Arrays;

public class primMST {

    int numNodes;
    int totalMSTCost;
    undirectedEdge edgeListHead;
    undirectedEdge MSTofG;
    int [] inWhichSet;

    public primMST(int numNodes){
        this.numNodes = numNodes;
        inWhichSet = new int[numNodes];
        Arrays.fill(inWhichSet,2);
        inWhichSet[0]=1;
        totalMSTCost=0;
        edgeListHead = new undirectedEdge(0,0,0);
        MSTofG = new undirectedEdge(0,0,0);
    }

    public void insertEdge(undirectedEdge edge){
        //TODO:implement insert sort
        undirectedEdge temp = edgeListHead;
        while(temp.next!=null&&temp.next.cost<=edge.cost){
            temp=temp.next;
        }
        edge.next=temp.next;
        temp.next=edge;

    }
    public undirectedEdge removeHead(){
        //TODO: remove head
        undirectedEdge e = edgeListHead.next;
        edgeListHead.next=e.next;
        return e;

    }
    public void pushEdge(undirectedEdge edge){
        //TODO
        edge.next=MSTofG.next;
        MSTofG.next=edge;

    }

    public void move2SetA(graphNode node){
        //TODO


    }
    public void printSet(){
        System.out.print("Set: [");
        for(Integer i : inWhichSet){
            System.out.print(i+" ");
        }
        System.out.println("]");


    }
    public boolean sameSet(){
        for (int i :inWhichSet){
            if (i==2)return false;
        }
        return true;
    }

    public void printList(undirectedEdge e){
        undirectedEdge temp = e;
        while(temp!=null){
            temp.printEdge();
            System.out.print(" -> ");
            temp=temp.next;
        }

        System.out.print("NULL\n");
    }


}
