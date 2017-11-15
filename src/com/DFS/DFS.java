package com.DFS;

import com.BFS.Vertex;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DFS {
    Stack<Vertex> stack = new Stack<>();
    List<Vertex> list = new ArrayList<>();

    public void dfsIterative(Vertex root){

        stack.add(root);
        while(!stack.isEmpty()){
            Vertex popped = stack.pop();
            System.out.print(popped.getVertexName()+" ");
            Collections.reverse(popped.getNeighbhors());
            for(Vertex v: popped.getNeighbhors()){
                if(!list.contains(v)){
                    stack.add(v);
                    list.add(v);
                }
            }
        }
    }
    public void dfs(Vertex root){
        root.setVisited(true);
        System.out.print(root.getVertexName()+" ");

        for(Vertex v:root.getNeighbhors()){
            if(!v.isVisited()) dfs(v);
        }
    }
}
