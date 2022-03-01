package oop.labor02.rectangle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[10];

        double total = 0;

        Random rand = new Random();

        for(int i=0;i<rectangles.length;i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length,width);
            total=total+rectangles[i].area();
        }
        for(int i=0;i<rectangles.length;i++){
            System.out.println("the width and length of the rectangle\n:" + rectangles[i].getLength() + "," + rectangles[i].getWidth());
            System.out.println("The area of the previous rectangle:" + rectangles[i].area());
            System.out.println("The perimeter of the previous rectangle:" + rectangles[i].perimeter());
        }
        System.out.println("The total area:" + total/rectangles.length);
    }
}
