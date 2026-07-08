
class LowMarkException extends Exception{
    LowMarkException(String s){
        super(s);

    }
}

public class ExceptionEx2 {
 public static void main(String[]args)throws LowMarkException{
  

    int mark=20;
    if(mark<40){
        throw new LowMarkException("Marks are lesser fail");
    }

 }



}
