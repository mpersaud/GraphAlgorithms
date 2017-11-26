package com.mst_prim;

import java.util.Arrays;

public class primMST {

    final int SET_A =1;
    final int SET_B =2;
    int numNodes;
    int totalMSTCost;
    undirectedEdge edgeListHead;
    undirectedEdge MSTofG;
    int [] inWhichSet;

    public primMST(int numNodes){
        this.numNodes = numNodes;
        inWhichSet = new int[numNodes];
        Arrays.fill(inWhichSet,SET_B);
        inWhichSet[0]=SET_A;
        totalMSTCost=0;
        edgeListHead = new undirectedEdge(0,0,0);
        MSTofG = new undirectedEdge(0,0,0);
    }

    public void insertEdge(undirectedEdge edge){
        undirectedEdge temp = edgeListHead;
        while(temp.next!=null&&temp.next.cost<=edge.cost ){
            temp=temp.next;
        }
        edge.next=temp.next;
        temp.next=edge;

    }
    public undirectedEdge removeHead(){
        if(edgeListHead.next==null)return null;
        undirectedEdge e = edgeListHead.next;
        edgeListHead.next=e.next;
        return e;

    }
    public void pushEdge(undirectedEdge edge){
        edge.next=MSTofG.next;
        MSTofG.next=edge;

    }
    public void move2SetA(graphNode node){
        //TODO maybe

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
            if (i==SET_B)return false;
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
    public  void remove (){
        undirectedEdge removedEdge = edgeListHead.next;
        undirectedEdge prevNode = edgeListHead.next;

        while(removedEdge!=null) {

            if(inWhichSet[removedEdge.ni-1]!=inWhichSet[removedEdge.nj-1]){
                totalMSTCost+=removedEdge.cost;
                if(inWhichSet[removedEdge.ni-1]==1)inWhichSet[removedEdge.nj-1]=1;
                else inWhichSet[removedEdge.ni-1]=1;
                prevNode.next=removedEdge.next;
                pushEdge(new undirectedEdge(removedEdge.ni,removedEdge.nj,removedEdge.cost));
                break;
            }
            prevNode=removedEdge;
            removedEdge=removedEdge.next;
        }

    }

    public void primAlgorithm() {
        while(!sameSet()) {
            remove();
        }
    }
}
