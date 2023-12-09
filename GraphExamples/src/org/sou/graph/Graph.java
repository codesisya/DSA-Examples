package org.sou.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
  int v;
  List<Integer>[] adjList;
  Graph(int v) {
    this.v = v;
    for (int i = 0; i < v; i++) {
      List<Integer> l = new ArrayList<>();
      adjList[i] = l;
    }
  }

    public void DFS(int src, boolean[] visited){
      visited[src] = true;
      System.out.println("node: "+src);
      for(Integer i: adjList[src]){
        if(!visited[i]){
          DFS(i,visited);
        }
      }
    }

    public void BFS(int src){
    boolean[] visited = new boolean[v];
      Queue<Integer> q = new LinkedList<>();

      while(!q.isEmpty()){
        Integer i = q.poll();
        visited[i] = true;
        System.out.println("node:"+i);
        for(Integer j:adjList[i]){
          if(!visited[j])
            q.add(j);
        }
      }
    }
}
