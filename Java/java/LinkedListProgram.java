import java.util.*;
public class LinkedListProgram{
    public static void main(String[] args){
      LinkedList<Integer> l=new LinkedList<Integer>();
      l.add(10);
      l.add(20);
      l.add(30);
      l.addFirst(40);
      l.addLast(60);
      System.out.println(l);
      System.out.println(l.toString());
      System.out.println(l.peekFirst());
      while(!l.isEmpty()){
          System.out.println(l.pollFirst());
      }
    }
}
