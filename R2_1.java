

class Kuruma {
    private int number;
    private double gasoline;

    public static int count[] = {0,0,0,0,0};
    public static void countNumber(){
        int i=0;
        for(i=0;i<5;i++)
            System.out.println("車のナンバー１桁目の番号が"+(i+1)+"の総数は"+count[i]+"です。");
    }

    public Kuruma(int n,double g){
        this.number = n;
        this.gasoline = g;
        count[this.number/1000-1]++;
        System.out.println("新しくナンバー："+this.number+"ガソリン量："+this.gasoline+"の車を作りました。");
    }
}

public class R2_1 {
    public static void main(String[] args){
        Kuruma.countNumber();

        Kuruma car1 = new Kuruma(5425,20.5);
        Kuruma car2 = new Kuruma(5222,20.5);
        Kuruma car3 = new Kuruma(4422,20.5);
        Kuruma car4 = new Kuruma(2233,20.5);
        Kuruma car5 = new Kuruma(5111,20.5);
        Kuruma car6 = new Kuruma(4244,20.5);
        Kuruma car7 = new Kuruma(3345,20.5);
        Kuruma car8 = new Kuruma(4511,20.5);
        Kuruma car9 = new Kuruma(3455,20.5);
        Kuruma car10 = new Kuruma(3234,20.5);

        Kuruma.countNumber();
    }
}
