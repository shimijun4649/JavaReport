import java.util.Scanner;

class Car0 {
    private int number;    
    private double gasoline;
    private double speed;
    
    public Car0(){
        number = 0;
        gasoline = 0.0;
        speed = 0.0;
    }

    public void setNumber(int n){
        number = n;
    }

    public void addGas(double g){
        gasoline = g;
    }

    public void changeSpeed(){
        System.out.println("車のスピードを入力してください");
        Scanner spe = new Scanner(System.in);
        double s = spe.nextDouble();
        speed = s;
        System.out.println("車のスピードが"+speed+"Km/hに変更されました。");
        spe.close();
    }

    public void showNumGas(){
        System.out.println("車のナンバーは"+this.number+"です。");
        System.out.println("車のガソリン量は"+this.gasoline+"です。");
    }

    public void showSpeed(){
        System.out.println("車の現在速度は"+this.speed+"Km/hです。");
    }
}

public class R1_2 {
    public static void main(String args[]){
        Car0 car1 = new Car0();
        car1.changeSpeed();
        car1.showSpeed();
    }
}