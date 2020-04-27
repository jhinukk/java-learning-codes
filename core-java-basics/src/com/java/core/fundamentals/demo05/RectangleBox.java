package com.java.core.fundamentals.demo05;

class RectangleBox extends RectanglePrismBox{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public RectangleBox(int length, int width, int depth, int weight){
        super(length, width, depth);
        this.weight = weight;
    }

    public int rectangleVolume(){
        return super.getLength()*super.getWidth();
    }

    public int rectangleArea(){
        return 2*(super.getLength()+super.getWidth());
    }
}
