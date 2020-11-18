class Gaku{
    private int num;
    private double english;
    private double math;
    private double japanese;

    

    public void setSeiseki(int n ,double e,double m, double j){
        num = n;
        english = e;
        math = m;
        japanese = j;
        System.out.println("学籍番号"+num+"：英語＝"+english+"、数学＝"+math+"、国語＝"+japanese+"のデータを登録しました");
    }

    public int getNum(){
        return this.num;
    }

    public double sumSeiseki(){
        return this.english+this.math+this.japanese;
    }
    
    public double avgSeiseki(){
        return (this.sumSeiseki())/3;
    }
}

public class R1_1{
    public static void main(String args[]){
        Gaku gaku1 = new Gaku();
        Gaku gaku2 = new Gaku();
        Gaku gaku3 = new Gaku();
        Gaku gaku4 = new Gaku();
        gaku1.setSeiseki(90001,72.4,54.6,67.5);
        gaku2.setSeiseki(90023,42.3,66.7,70.2);
        gaku3.setSeiseki(90045,53.5,77.8,65.7);
        gaku4.setSeiseki(90086,80.3,93.9,85.6);
        System.out.println("学籍番号"+gaku1.getNum()+"：合計点＝"+gaku1.sumSeiseki()+" 平均点＝"+String.format("%.1f",gaku1.avgSeiseki())+"です。");
        System.out.println("学籍番号"+gaku2.getNum()+"：合計点＝"+gaku2.sumSeiseki()+" 平均点＝"+String.format("%.1f",gaku2.avgSeiseki())+"です。");
        System.out.println("学籍番号"+gaku3.getNum()+"：合計点＝"+gaku3.sumSeiseki()+" 平均点＝"+String.format("%.1f",gaku3.avgSeiseki())+"です。");
        System.out.println("学籍番号"+gaku4.getNum()+"：合計点＝"+String.format("%.1f",gaku4.sumSeiseki())+" 平均点＝"+String.format("%.1f",gaku4.avgSeiseki())+"です。");
    }
}

