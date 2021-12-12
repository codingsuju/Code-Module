import java.util.*;
public class MapProgram{
    public static void main(String[] args){
       Map<Integer,String> m=new HashMap<Integer,String>();
       m.put(10,"Ten");
       m.put(11,"Eleven");
       m.put(9,"Nine");
       m.put(14,"Fourteen");
       System.out.println(m);
       ArrayList<Integer> toBeRemoved= new ArrayList<Integer>();
       for(Map.Entry<Integer,String> it: m.entrySet()){
           System.out.print(it.getKey()+"->");
           toBeRemoved.add(it.getKey());
           System.out.println(it.getValue());
       }
       Map<Integer,String> tm=new TreeMap<Integer,String>();
       tm.putAll(m);
       System.out.println(tm);
       toBeRemoved.remove(0);
       m.keySet().removeAll(toBeRemoved);
       System.out.println(m);
    }
}
