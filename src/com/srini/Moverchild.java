package com.srini;

public class Moverchild extends Moverriding {
    void display() {
        System.out.println("child class display method");
    }

    public void show() {
        super.show();
        System.out.println("child class show method");
    }

    public static void main(String[] args) {
     /*   Moverriding mp = new Moverriding();
        mp.display();*/
        Moverriding mc = new Moverchild();
       // mc.display();
        mc.show();
    }
}
