
import java.util.*;
class WF{
    public static void main(String[] a){
        String s="java is java";
        String[] w=s.split(" ");
        HashMap<String,Integer> m=new HashMap<>();
        for(String x:w)m.put(x,m.getOrDefault(x,0)+1);
        System.out.println(m);
    }
}