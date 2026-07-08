
import java .util.HashMap;
import java.util.Map;
public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101, "ini");
        map.put(102, "rithu");
        map.put(103, "sri");
        map.put(104, "nishu");
        map.put(105, "rose");
        map.put(106, "dog");
            System.out.println(map.keySet());
            System.out.println(map.values());
              map.containsKey(101);
             map.containsValue("ini");
             System.out.println(map.get(102));
             //travelling map
             for(Integer i:map.keySet()){
                System.out.println(i+"->"+map.get(i));
             }
             //2.using entrySet()
             for(Map.Entry<Integer,String> entry:map.entrySet()){
             if(entry.getKey()%2==0){
                System.out.println("Using EntrySet");
             
                System.out.print(entry.getKey()+" ->"+entry.getValue());
                 
             }
             

             }





        
    }

    
}
