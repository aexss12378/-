import java.util.Scanner;

class Animal {
    String name;
    double height;
    int weight;
    double speed;

    void show(){
        System.out.println("姓名:"+name+" 身高:"+height+"(m)"+" 體重:"+weight+"(kg)"+" 速度:"+speed+"(m/min)");
    }

    double distance(int x ,double y){
        double k=x*y*speed;
        return k;
    }

    double distance(int x){
        double k=x*speed;
        return k;
    }


}



public class Main {

    public static void main(String[] args) {
        Animal kkk[] =new Animal[4];

        for(int i=0 ;i<kkk.length;i++){
        kkk[i]= new Animal();
        }

        kkk[0].name="雪寶";
        kkk[0].height=1.1;
        kkk[0].weight=52;
        kkk[0].speed=100;

        kkk[1].name="驢子";
        kkk[1].height=1.5;
        kkk[1].weight=99;
        kkk[1].speed=200;


        kkk[2].name="安那";
        kkk[2].height=1.7;
        kkk[2].weight=48;
        kkk[2].speed=120;

        kkk[3].name="愛沙";
        kkk[3].height=1.7;
        kkk[3].weight=50;
        kkk[3].speed=120;

        for(int i=0 ;i<kkk.length;i++){
           System.out.println("");
           kkk[i].show();
           Scanner sc = new Scanner(System.in);
           System.out.print("請輸入"+kkk[i].name+"的時間(min):");
           int x =sc.nextInt();
           System.out.print("請輸入"+kkk[i].name+"的加速度(不需要可以隨便案):");
           double y =sc.hasNextDouble() ? sc.nextDouble() : 1;
           if (y == 1) {
               System.out.println(kkk[i].name+"的奔跑距離為"+kkk[i].distance(x));
           } else {
               System.out.println(kkk[i].name+"的奔跑距離為"+kkk[i].distance(x,y));
           }
        }

    }
}