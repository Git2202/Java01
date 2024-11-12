class IS20a{
    static int values =10;
    static class Nested{
        void display(){
            System.out.println(values);
        }
    }
    public static void main (String[] args){
        IS20a.Nested nested=new IS20a.Nested();
        nested.display();
    }
}
