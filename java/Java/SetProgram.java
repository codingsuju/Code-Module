import java.util.*;
public class SetProgram{
    public static void main(String[] args){
       Set<Integer> s=new HashSet<Integer>();
       s.add(10);
       s.add(20);
       s.add(40);
       s.add(30);
       System.out.println(s);
       Set<Integer> ts=new TreeSet<Integer>();
       ts.addAll(s);
       Iterator<Integer> it=s.iterator();
       while(it.hasNext()){
           Integer x=it.next();
           System.out.println(x);
       }
       System.out.println(s);
       ArrayList<Integer> a=new ArrayList<Integer>();
       for(Integer x:s){
          System.out.println(x);
          a.add(x);
       }
       s.removeAll(a);
       System.out.println(s);
       System.out.println(ts);
    }
}
