public class ExceptionEx {
    public static void main(String[]args){
        System.out.println("program started");
        try{
            int result=10/10;
            System.out.println(result);
            int[]arr={1,2,3,4};
            System.out.println(arr[5]);

        }
         catch(ArithmeticException e){
            System.out.println("Number was Divided by zero");
          }
          catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index value greater than array size");
          }
          finally{
            System.out.println("from finally block");
          }
         System.out.println("program Ended");
        

    }
    
}
