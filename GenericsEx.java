class Box<T>{
     T value;
    public void set(T value){
        this.value=value;
    }
    public T get(){
        return value;
    }

}


public class GenericsEx {
    public static void main(String[] args) {
        Box<Integer> b =new Box ();
        b.set(60);
        int i=b.get();
        System.out.println(i);
        
    }
    
}
