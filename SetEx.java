import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> hash=new HashSet<>();
        hash.add(10);
        hash.add(10);
        hash.add(20);
        hash.add(30);
        System.out.println("HashSet:");
        for(int i:hash){
            System.out.println(i+" ");
        }
        
        LinkedHashSet<Integer> linked=new LinkedHashSet<>();
        linked.add(10);
        linked.add(20);
        linked.add(20);
        linked.add(40);
        System.out.println("LinkedHashSet:");
        for(int i:linked){
            System.out.println(i+" ");
        }
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(30);
        tree.add(10);
        tree.add(20);
        tree.add(10);
        System.out.println("TreeSet:");
        for(int i:tree){
            System.out.println(i+" ");
        }
    
    


        
    }
    
}
