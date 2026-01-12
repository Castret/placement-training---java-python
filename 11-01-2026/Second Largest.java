
class SL{
    public static void main(String[] a){
        int[] x={10,20,5,40};
        int f=0,s=0;
        for(int i:x){
            if(i>f){s=f;f=i;}
            else if(i>s && i!=f)s=i;
        }
        System.out.println(s);
    }
}