package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void bfs(Vertex root){
        Queue<Vertex> queue = new LinkedList<Vertex>();

        root.setVisited(true);
        queue.add(root);
        while(!queue.isEmpty()){
            Vertex removed= queue.remove();
            System.out.print(removed.vertexName+" ");
            for(Vertex v:removed.neighbhors){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
