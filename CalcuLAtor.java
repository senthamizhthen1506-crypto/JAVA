import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        char c = in.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("no such operation");
                break;
                
            
        }




    }
    
}
