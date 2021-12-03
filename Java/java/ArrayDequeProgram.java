import java.util.*;
public class ArrayDequeProgram{
    public static void main(String[] args){
      ArrayDeque<Integer> ad= new ArrayDeque<Integer>(10);
      ad.addFirst(10);
      ad.addFirst(20);
      ad.addLast(30);
      ad.addFirst(40);
      ad.addLast(50);
      System.out.println(ad.size());
      System.out.println(ad);
      //ad.removeAt(0); //Error
      System.out.println(ad);
      System.out.println(ad.getFirst());
      System.out.println(ad.getLast());
      System.out.println(ad.peekFirst());
      System.out.println(ad.peekLast());
      /*while(!ad.isEmpty()){
          System.out.println(ad.removeFirst());
      } */
    }
}
