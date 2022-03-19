package com.raitech.graph;

class Vertex {
    char label;
    boolean wasVisited;

    Vertex(char label) {
        this.label = label;
        wasVisited = false;
    }
}
