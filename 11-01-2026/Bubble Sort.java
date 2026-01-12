
import java.util.*;
class BBS{
    public static void main(String[] a){
        int[] x={5,1,4,2};
        for(int i=0;i<x.length;i++)
            for(int j=0;j<x.length-i-1;j++)
                if(x[j]>x[j+1]){
                    int t=x[j];x[j]=x[j+1];x[j+1]=t;
                }
        System.out.println(Arrays.toString(x));
    }
}