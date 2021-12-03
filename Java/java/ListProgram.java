import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class ListProgram{
    public static void main(String[] args){
        List<String> s=new ArrayList<String>();
        s.add("Suju");
        s.add("Daimary");
        System.out.println(s.get(0));
        s.set(0,"Coding");
        s.set(1,"Suju");
        ArrayList<String> t=new ArrayList<String> ();
        t.add("Developer");
        t.add("Boy");
        s.addAll(1,t);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.lastIndexOf("Developer"));
    }
}
