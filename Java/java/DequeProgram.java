import java.util.*;
public class DequeProgram{
    public static void main(String[] args){
      Deque<Integer> dq= new ArrayDeque<Integer>();
      dq.addFirst(10);
      dq.addFirst(20);
      dq.addLast(30);
      dq.addFirst(40);
      dq.addLast(50);
      System.out.println(dq);
      System.out.println(dq.getFirst());
      System.out.println(dq.getLast());
      System.out.println(dq.peekFirst());
      System.out.println(dq.peekLast());
      while(!dq.isEmpty()){
          System.out.println(dq.removeFirst());
      }
    }
}
