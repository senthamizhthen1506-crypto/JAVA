abstract class Animal{//abstract class contains both absratct method and normal method
    abstract void sound();//abstract method
    void sleep(){//concrete method
        System.out.println("sleeping");
    }
} 
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
 
 
 
 class AbstractionEx {
    public static void main(String[]args){
        Dog d=new Dog(); 
        d.sleep();
        d.sound();


    }
    
}
