package Unit3;

import java.util.Scanner;

public class T3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Crew s1 = new Teacher(sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
        Crew s2 = new Experimenter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
        Crew s3 = new Officer(sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
        System.out.print(s1.toString() + "\n");
        System.out.print(s2.toString() + "\n");
        System.out.print(s3.toString() + "\n");
        sc.close();
    }

//    public static String getDetails(Crew emp) {
//        String info;
//        info = emp.getTag() + ":\nname:" + emp.getName() + "\nempNo:" + emp.getId() +
//                "\nbaseSalary:" + String.format("%.1f", emp.getSalary()) + "\n" +
//                emp.moreInfo() + "salary:" + String.format("%.1f\n", emp.calSalary());
//        return info;
//    }
}


abstract class Crew {
    private final String name;
    private final int id;
    double salary;
    //打tag看是什么员工方便打印
    private String tag;

    //顺便把getter和setter写了
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Crew(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //抽象算工资
    public abstract double calSalary();

    //getters

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public abstract String moreInfo();

    public String toString() {
        String info = getTag() + ":\nname:" + getName() + "\nempNo:" + getId() +
                "\nbaseSalary:" + String.format("%.1f", getSalary()) + "\n" +
                moreInfo() + "salary:" + String.format("%.1f\n", calSalary());
        return info;
    }
}

class Teacher extends Crew {
    //课酬标准，final，确实无法继承
    private final int remuneration;
    //月课时
    private final int classHour;

    //构造函数
    public Teacher(String name, int id, double salary, int remuneration, int classHour) {
        super(name, id, salary);
        this.remuneration = remuneration;
        this.classHour = classHour;
        super.setTag("teacher");
    }

    public double calSalary() {
        return salary + remuneration * classHour;
    }

    public String moreInfo() {
        return "hourlyFee:" + remuneration + "\nmonthlyHour:" + classHour + "\n";
    }
}

class Experimenter extends Crew {
    private final int expHour;

    public Experimenter(String name, int id, double salary, int expHour) {
        super(name, id, salary);
        this.expHour = expHour;
        super.setTag("lab worker");
    }

    public double calSalary() {
        return salary + expHour * 50;
    }

    public String moreInfo() {
        return "monthlyHour:" + expHour + "\n";
    }
}

class Officer extends Crew {
    private final double allowance;

    public Officer(String name, int id, double salary, int allowance) {
        super(name, id, salary);
        this.allowance = allowance;
        super.setTag("staff");
    }

    public double calSalary() {
        return salary + allowance;
    }

    public String moreInfo() {
        return String.format("allowance:%.1f\n", allowance);
    }
}
