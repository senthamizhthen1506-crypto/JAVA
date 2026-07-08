public class WrapperClassEx {
    public static void main(String[]args){
        String s=("155");
        int x=Integer.parseInt(s);//converts sting to int
        System.out.println(s);
        System.out.println(x);
        int n=100;
        Integer i=Integer.valueOf(n);//Boxing primitive to obj
        i=200;//autoboxing
        int a=i.intValue();//unboxing obj to primitive
        int b=i;//autounboxing




    }
    
}
