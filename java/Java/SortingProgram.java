import java.util.*;
import java.util.Arrays;
class CustomComparator implements Comparator<String>{
    public int compare(String x,String y){
         return x.compareTo(y);
    }
}
public class SortingProgram{
    public static void main(String[] args){
        String[] S= new String[4];
        S[0]="coder";
        S[1]="coder";
        S[2]="codco";
        S[3]="codef";
        Arrays.sort(S,new CustomComparator());
        for(Integer i=0;i<4;i++){
            System.out.print(S[i]+" ");
        }
        System.out.println("");
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(4);
        a.add(10);
        a.add(2);
        a.add(1);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}
