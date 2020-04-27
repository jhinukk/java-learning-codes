package com.java.core.fundamentals.demo05;

public class RectanglePrismBox {
    private int length;
    private int width;
    private int depth;

    public RectanglePrismBox(int length,int width,int depth){
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public RectanglePrismBox(){
        this.length = -1;
        this.width = -1;
        this.depth = -1;
    }
    public RectanglePrismBox(int len){
        length = width = depth = len;
    }

    public int getLength(){
        return length;

    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int prismvolume(){
        return length*width*depth;
    }

}

