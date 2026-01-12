
import java.util.*;
class Ana{
    public static void main(String[] a){
        char[] x="listen".toCharArray();
        char[] y="silent".toCharArray();
        Arrays.sort(x); Arrays.sort(y);
        System.out.println(Arrays.equals(x,y));
    }
}