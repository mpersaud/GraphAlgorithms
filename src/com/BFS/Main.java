package com.BFS;


public class Main {
    public static void main(String[] args) {

        Vertex[] vertices = new Vertex[8];
        char[] chars = {'A','B','C','D','E','F','G','H'};
        for(int i=0;i<8;i++){
            Vertex v = new Vertex(chars[i]);
            vertices[i]=v;
        }
        // creating a random graph
        vertices[0].addNeighbhor(vertices[1]);
        vertices[0].addNeighbhor(vertices[2]);
        vertices[0].addNeighbhor(vertices[3]);
        vertices[1].addNeighbhor(vertices[4]);
        vertices[1].addNeighbhor(vertices[5]);
        vertices[2].addNeighbhor(vertices[6]);
        vertices[1].addNeighbhor(vertices[7]);
        /*
                           A
                      /    |    \
                     B     C     D
                   / | \   |
                  E  F  H  G




         */
        //print out vertices and neighbors
        for(Vertex v:vertices){
            System.out.println(v);
        }

        BFS b = new BFS();
        b.bfs(vertices[0]);

    }

}
