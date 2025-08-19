package Assesment;

class animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

 public class inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}

