package com.raitech.graph;

import com.raitech.stack.Stack;

class Graph {
    int MAX_VERTICES = 20;
    Vertex[] vertices; // array of vertices
    int[][] adjMat; // adjacency matrix
    int nVertices; // current number of vertices
    Stack stack;

    Graph() {
        vertices = new Vertex[MAX_VERTICES];
        adjMat = new int[MAX_VERTICES][MAX_VERTICES];
        nVertices = 0;
        for (int i = 0; i < MAX_VERTICES; i++) {
            for (int j = 0; j < MAX_VERTICES; j++) {
                adjMat[i][j] = 0;
            }
        }
        stack = new Stack<Integer>(20);
    }

    void addVertex(char label) {
        var vertex = new Vertex(label);
        vertices[nVertices] = vertex;
    }

    void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    void displayVertex(int v) {
        System.out.printf("%c\n", vertices[v].label);
    }

    int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVertices; i++) {
            if (adjMat[v][i] == 1 && vertices[v].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }

    void dfs() {

    }
}
