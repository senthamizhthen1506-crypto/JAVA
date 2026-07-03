 class Student {
    //properties
    String name;
    int rollno;
    //constructor
    Student(){
        name="default name";
        rollno=1;

    }
    //parameterized constructor
    Student(String name,int rollno){//local varaible
        this.name=name;
        this .rollno=rollno;

    }

    //behaviour
    void sleep(){
        System.out.println("sleeping");
    }


    
}
class cls{
    public static void main(String[]args){
        Student student1=new Student("goplu",33);
        Student student2=new Student();
        student1.name="senthu";
        student1.sleep();
        System.out.println(student1.name);
        System.out.println(student1.rollno);

    }

}
