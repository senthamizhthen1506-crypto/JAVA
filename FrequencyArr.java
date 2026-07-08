import java.util.HashMap;
import java.util.Map;
public class FrequencyArr {
     public static void main(String[] args) {
        int[] arr={1,2,3,1,2,4,5};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        
    }
    
}
