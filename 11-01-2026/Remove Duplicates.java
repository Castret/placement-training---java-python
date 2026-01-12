
import java.util.*;
class RD{
    public static void main(String[] a){
        int[] x={1,2,2,3,3};
        HashSet<Integer> s=new HashSet<>();
        for(int i:x)s.add(i);
        System.out.println(s);
    }
}