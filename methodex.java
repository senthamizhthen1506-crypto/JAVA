public class methodex {
   public static int addnumbers(int num1, int num2){
    return num1+num2;
   } 
    public static int subnumbers (int num1,int num2){
        return num2-num1;
    }
    publi static void one(){
        two();
        System.out.println("from method one");
    }
    public static void two(){
        three();
        System.out.println("from method two");
    }
    public static void three(){
            
    }

        public static void main(String[] args) {
            one();
    methodex obj=new methodex();
    System.out.println(obj.addnumbers(11,12));
    System.out.println(subnumbers(11,12));

        
    }
    
}
