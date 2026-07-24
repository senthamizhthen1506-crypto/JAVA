import java.util.Collections;
import java.util.PriorityQueue;


public class HeapEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(50);
        maxHeap.add(40);
        System.out.println(maxHeap.peek());//50
        System.out.println(maxHeap);
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        minHeap.add(50);
        minHeap.add(20);
        minHeap.add(40);
        minHeap.add(10);
        System.out.println(minHeap.peek());//10
        System.out.println(minHeap);


        
    }
    
}
