
class ATM{
    int b=1000;
    void d(int a){b+=a;}
    void w(int a){if(a<=b)b-=a;}
    public static void main(String[] a){
        ATM x=new ATM();
        x.d(200); x.w(150);
        System.out.println(x.b);
    }
}