package BFS;

import BFS.Vertex;

public class Main {
    public static void main(String[] args) {
        System.out.println("Success");
        Vertex [] vertices = new Vertex[8];
        char[] chars = {'A','B','C','D','E','F','G','H'};
        for(int i=0;i<8;i++){
            Vertex v = new Vertex(chars[i]);
            vertices[i]=v;
        }

        vertices[0].addNeighbhor(vertices[1]);
        vertices[0].addNeighbhor(vertices[2]);
        vertices[0].addNeighbhor(vertices[3]);
        vertices[1].addNeighbhor(vertices[4]);
        vertices[1].addNeighbhor(vertices[5]);
        vertices[2].addNeighbhor(vertices[6]);
        vertices[1].addNeighbhor(vertices[7]);

        for(Vertex v:vertices){
            System.out.println(v);
        }

        BFS b = new BFS();
        b.bfs(vertices[0]);







    }

}
