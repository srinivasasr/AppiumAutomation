package com.srini;

import java.util.Arrays;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Thomas");
        cats[1] = new Cat("Behemoth");
        cats[2] = new Cat("Lionel Messi");

        cats[1] = null;


        System.out.println(Arrays.toString(cats));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}