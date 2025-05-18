import java.util.Scanner;

public class T2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String id = sc.next();
        float score = sc.nextFloat();
        Student s1 = new Student(name, id, score);
        s1.show();
    }
}

class Student{
    private String name;
    private String id;
    private float score;

    //构造方法
    //无参构造
    public Student(){};
    //带参构造
    public Student(String name,String id,float score){
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public float calGpa(){
        if(score < 60){
            return 0;
        }
        else
            return (score/10-5);
    }

    public void show(){
        System.out.printf("%s %s %.1f %.2f",name,id,score,calGpa());
    }
}
