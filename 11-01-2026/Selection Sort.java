
import java.util.*;
class SS{
    public static void main(String[] a){
        int[] x={64,25,12};
        for(int i=0;i<x.length;i++){
            int m=i;
            for(int j=i+1;j<x.length;j++)
                if(x[j]<x[m])m=j;
            int t=x[i];x[i]=x[m];x[m]=t;
        }
        System.out.println(Arrays.toString(x));
    }
}