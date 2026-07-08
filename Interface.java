 interface flyable{
    int a=100;//static and final
   void fly();//public and abstract
   default boolean canfly(){
    return true;
   }
}
interface movable{
    void fly();

}
class Bird implements flyable{
    public void fly(){
        System.out.println("Birds can fly");
    }

}
class Aeroplanes implements flyable,movable{
    public void fly(){
        System.out.println("plane can fly");

    }
}
public class Interface{
    public static void main(String[]args){
        Bird b=new Bird();
        System.out.println(b.canfly());

    }
    
}
