
class BS{
    public static void main(String[] a){
        int[] x={2,4,6,8,10};
        int t=6,l=0,h=x.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(x[m]==t){System.out.println(m);return;}
            if(x[m]<t)l=m+1; else h=m-1;
        }
        System.out.println(-1);
    }
}