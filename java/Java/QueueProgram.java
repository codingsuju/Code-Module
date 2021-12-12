import java.util.*;
public class QueueProgram{
    public static void main(String[] args){
      Queue<Integer> q=new LinkedList<Integer>();
      q.add(10);
      q.add(20);
      q.add(30);
      System.out.println(q);
      System.out.println(q.peek());
      while(!q.isEmpty()){
         System.out.println(q.poll());
      }
      System.out.println(q);
      q.add(90);
      q.add(60);
      q.add(70);
      System.out.println(q);
    }
}
