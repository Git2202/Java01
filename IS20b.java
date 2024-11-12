public class IS20b {
    int value=5;
    class Inner{
        void display(){
            System.out.println(value);
        }
    }
    public static void main(String[] args){
        IS20b outer=new IS20b();
        IS20b.Inner inner =outer.new Inner();
        inner.display();
    }
}
