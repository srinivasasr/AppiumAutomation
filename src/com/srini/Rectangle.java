package com.srini;

public class Rectangle {
   int top;
     int left;
    int width;
    int height;

    public Rectangle(int top,int left,int width, int height){
        this.top = top;
        this.left = left;
    }
public Rectangle(Rectangle rec){
        rec.width=0;
        rec.height = 0;
}
    public static void main(String[] args) {

    }
}