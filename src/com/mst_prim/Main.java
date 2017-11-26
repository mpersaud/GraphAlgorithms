package com.mst_prim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("run forest run");
        int numNodes= 0;
        try {
            Scanner s = new Scanner(new File(args[0]));
            numNodes=Integer.parseInt(s.nextLine());
            primMST mst = new primMST(numNodes);
            while(s.hasNext()){

                int i = Integer.valueOf(s.next());
                int j = Integer.valueOf(s.next());
                int cost = Integer.valueOf(s.next());

                undirectedEdge eIn = new undirectedEdge(i,j,cost);
                undirectedEdge eOut = new undirectedEdge(j,i,cost);
                mst.insertEdge(eIn);
                mst.printList(mst.edgeListHead);
                //mst.insertEdge(eOut);
                //mst.printList(mst.edgeListHead);

            }
            System.out.println();
            mst.primAlgorithm();

            mst.printList(mst.MSTofG);
            System.out.println("TOTAL COST:"+mst.totalMSTCost);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("finish him!");

    }




}
