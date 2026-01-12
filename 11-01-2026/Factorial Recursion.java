
class FAC{
    static int f(int n){return n==1?1:n*f(n-1);}
    public static void main(String[] a){
        System.out.println(f(5));
    }
}