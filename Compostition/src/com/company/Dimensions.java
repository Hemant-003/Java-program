package com.company;

public class Dimensions {
    private int height;
    private int width;
    private int depth;

    public Dimensions(int depth,int height,int width){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }
}
