
import java.util.*;
public class ArrayListEx {
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list .add(30);
        list.set(1, 15);
        list.remove(2);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" " );
        }
        for(int i:list){
            System.out.println(i+" ");
        }

        
        
        

    }
    
}
