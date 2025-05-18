import java.util.Scanner;

public class T2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l = sc.nextFloat();
        float w = sc.nextFloat();
        Rect r1 = new Rect(l, w);
        sc.close();
        System.out.println(r1.getArea() + " " + r1.getCir());
        Rect r2 = new Rect(15, 6);
        System.out.println(r2.getArea() + " " + r2.getCir());
    }
}

class Rect {
    private float length;
    private float width;

    public Rect(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getArea() {
        return length * width;
    }

    public float getCir() {
        return (length + width) * 2;
    }

    //标准方法


    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}