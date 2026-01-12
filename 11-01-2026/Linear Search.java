class LS{
    public static void main(String[] a){
        int[] x={3,5,7,9};
        int t=7;
        for(int i=0;i<x.length;i++)
            if(x[i]==t){System.out.println(i);return;}
        System.out.println(-1);
    }
}