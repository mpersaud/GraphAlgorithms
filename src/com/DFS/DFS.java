package com.DFS;

import com.BFS.Vertex;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    Stack<Vertex> stack = new Stack<>();
    List<Vertex> list = new ArrayList<>();

    public void dfsIterative(Vertex root){

        stack.add(root);
        while(!stack.isEmpty()){
            Vertex popped = stack.pop();
            System.out.println(popped.getVertexName());
            for(Vertex v: popped.getNeighbhors()){
                if(!list.contains(v)){
                    stack.add(v);
                    list.add(v);
                }

            }
        }


    }
}
