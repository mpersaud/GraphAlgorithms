package BFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    char vertexName;
    boolean visited;
    List<Vertex> neighbhors;
    public Vertex(char s){
        vertexName=s;
        neighbhors= new ArrayList<>();
    }
    public void addNeighbhor(Vertex v){
        neighbhors.add(v);
    }
    public char getVertexName() {
        return vertexName;
    }

    public void setVertexName(char vertexName) {
        this.vertexName = vertexName;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbhors() {
        return neighbhors;
    }

    public void setNeighbhors(List<Vertex> neighbhors) {
        this.neighbhors = neighbhors;
    }

    @Override
    public String toString(){
        String s="";
        for(Vertex v: neighbhors){
            s+=v.vertexName+",";

        }
        return vertexName+": {"+s+"}" ;
    }
}
