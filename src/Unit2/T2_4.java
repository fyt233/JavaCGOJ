package Unit2;

import java.util.Scanner;

public class T2_4 {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        sc.close();
        MyMath m1 = new MyMath(a,b,c);
        System.out.printf("max=%d\nmin=%d\nsum=%d\navg=%.1f",MyMath.max(),MyMath.min(),MyMath.sum(),MyMath.avg());
    }
}
class MyMath{
    private static int a,b,c;

    public MyMath(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static int max(){
        int temp=0;
        temp= Math.max(a, b);
        temp= Math.max(temp, c);
        return temp;
    }
    public static int min(){
        int temp=0;
        temp= Math.min(a, b);
        temp= Math.min(temp, c);
        return temp;
    }
    public static int sum(){
        return a+b+c;
    }

    public static float avg(){
        return sum()/3.0f;
    }
}
