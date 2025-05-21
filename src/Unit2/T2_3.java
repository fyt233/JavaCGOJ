package Unit2;

import java.util.Scanner;

public class T2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fen = sc.nextInt();
        sc.close();
        Money m1 = new Money(fen);
        m1.show();
    }
}

class Money{
    private int yuan=0;
    private int jiao=0;
    private int fen=0;
    public Money(int fen){
        this.fen=fen;
        this.jiao=fen/10;
        this.yuan=this.jiao/10;
        this.jiao=this.jiao%10;
        this.fen=this.fen%10;
    }
    public void show(){
        if(yuan==0){
            if(jiao==0){
                System.out.println(fen+"fen");
            }
            else{
                System.out.println(jiao+"jiao "+fen+"fen");
            }
        }
        else{
            System.out.println(yuan+"yuan "+jiao+"jiao "+fen+"fen");
        }
    }
}
