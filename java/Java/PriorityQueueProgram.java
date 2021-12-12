import java.util.*;
class CustomComparator implements Comparator<Integer> {
    public int compare(Integer x,Integer y){
        return y.compareTo(x);
    }
}
public class PriorityQueueProgram{
    public static void main(String[] args){
      PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new CustomComparator());
      pq.add(10);
      pq.add(90);
      pq.add(60);
      pq.add(30);
      while(!pq.isEmpty()){
          System.out.println(pq.poll());
      }
    }
}
