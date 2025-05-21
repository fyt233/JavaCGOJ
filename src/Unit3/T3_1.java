package Unit3;

import java.util.Scanner;

public class T3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        Circle c1 = new Circle(radius);
        System.out.println(c1.toString());
        Rectangle r1 = new Rectangle(sc.nextInt(),sc.nextInt());
        System.out.println(r1.toString());

        sc.close();
    }
}

class Circle{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    public double getCircum(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        String info;
        info = "radius="+radius+" perimeter="+String.format("%.2f",getCircum())+" area="+String.format("%.2f",getArea());
        return info;
    }

    public int getRadius(){
        return radius;
    }

}

class Rectangle extends Circle{
    private int height;
//    private int radius;
    public Rectangle(int radius,int height){
        super(radius);
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    public String toString(){
        String info;
        info = "radius="+super.getRadius()+" perimeter="+String.format("%.2f",super.getCircum())+" area="+String.format("%.2f",super.getArea())+" height="+height+" volume="+String.format("%.2f",getVolume());
        return info;
    }

}
