 
    class Animal  {
    Animal(){
        System.out.println("from animal constructor");
    }
    String Color="Black";
    String name;
    void eating(){
        System.out.println("Eating");
    }
    
}
class Cat extends Animal{
    String Color="Brown";
     void displayColor(){
        System.out.println(Color);
        System.out.println(super.Color);
    }
    Cat(){
        System.out.println("Cat constructor");
    }
    
}

    
   class InheritanceEx{
    public static void main(String[] args) {
       Animal c=new Cat();
       c.displayColor();
       c.eating();

    }

    
}
