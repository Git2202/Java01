class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat Meows");
    }
}
public class IS21 {
    public static void main(String[] args){
        Animal a1=new Dog();
        Animal a2=new Cat();
        a1.sound();
        a2.sound();
    }
}
