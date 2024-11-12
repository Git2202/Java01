class MathsOp{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
}
public class IS17 {
    public static void main(String[] args){
        MathsOp addd=new MathsOp();
        System.out.println("Int:"+ addd.add(20,30));
        System.out.println("Double:"+ addd.add(1.23546,2.35421));
    }
}
