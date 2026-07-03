 class Animal  {
    Animal(){
        System.out.println("from animal constructor");
    }
    String name;
    void eating(){
        System.out.println("Eating");
    }
    
}
class Cat extends Animal{
    Cat(){
        System.out.println("Cat constructor");
    }
}

    
   class Inheritance{
    public static void main(String[] args) {
       Animal c=new Cat();
       c.eating();

    }

}
