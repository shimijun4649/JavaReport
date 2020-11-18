
abstract class Car {
    protected int num;
    protected double gas;

    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("新しく車を作りました");
    }

    public void setCar(int n,double g){
        num = n;
        gas =g;
        System.out.println("車のナンバー:"+num+"、車のガソリン量"+gas+"にしました。");
    }

    public String toString(){
        String str = "ナンバー:"+num+"、ガソリン量:"+gas+"のオブジェクトです。";
        return str;
    }


    public abstract void show();
}

class Kanko extends Car{
    private String des;
    private int cap;

    public Kanko(){
        super();
        System.out.println("新しく観光バスを作りました");
    }

    public void setKanko(int n,double g,String d,int c){
        super.setCar(n,g);
        this.des = d;
        this.cap = c;
        System.out.println("行き先:"+this.des+"、定員:"+this.cap+"にしました。");
    }

    @Override
    public void show(){
        System.out.println("観光バスのナンバーは"+this.num+"です。");
        System.out.println("観光バスのガソリン量は"+this.gas+"です。");
        System.out.println("観光バスの行き先はは"+this.des+"、定員は"+this.cap+"です。");
    }
}

public class R2_2{
    public static void main(String[] args){
        Kanko kanko = new Kanko();
        kanko.setKanko(3524,29.4,"新潟",30);
        kanko.show();
    }
}
