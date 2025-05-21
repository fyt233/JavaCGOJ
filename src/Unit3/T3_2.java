package Unit3;

import java.util.Scanner;

public class T3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s1 = new Cir(sc.nextDouble());
        Shape s2 = new Rec(sc.nextDouble(),sc.nextDouble());
        System.out.printf("%.2f\n",s1.calArea());
        System.out.printf("%.2f\n",s2.calArea());
    }
}

abstract class Shape {

    //private final double n;
    //并非final不然不能继承很难蚌
    private double n;

    public Shape(double n) {
        this.n = n;
    }

    //抽象类
    public abstract double calArea();

    //getter
    public double getN() {
        return n;
    }
}

class Cir extends Shape {
    public Cir(double n) {
        super(n);
    }

    public double calArea() {
        return Math.PI * getN() * getN();
    }
}

class Rec extends Shape {
    //特有的m
    private double m;
    public Rec(double n,double m) {
        super(n);
        this.m = m;
    }


    public double calArea() {
        return getN() * m;
    }
}
