abstract class Shape {
    abstract double calculateArea();
}
class Circle extends Shape{
    int radius;
        Circle(int radius){
            this.radius=radius;
        }
    double calculateArea(){
        return 3.17*radius*radius;

    }   
    }
class Rectangle extends Shape{

     int n;
     int m;
     Rectangle(int l,int b){

        this.n=l;
        this.m=b;

     }
    
        double calculateArea(){
            return n*m;
            }    }

 public class AbstractionEx2{

    public static void main(String[]args){
        Circle c=new Circle(6);
        Rectangle r=new Rectangle(15,45);
        System.out.println(c.calculateArea());
        System.out.println(r.calculateArea());
      





    }
}
     



