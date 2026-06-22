import java.util.Scanner;
public class Days {
    public static void main(String[]args){
       
      Scanner s = new Scanner(System.in);
        int Days= s.nextInt();
        switch(Days){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            default:
                System.out.println("default case");
                break;

        
        }
    }
    
}
