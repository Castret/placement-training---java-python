class Bank{
    int b=1000;
    void d(int a){b+=a;}
    void w(int a){if(a<=b)b-=a;}
    public static void main(String[] a){
        Bank x=new Bank();
        x.d(500); x.w(300);
        System.out.println(x.b);
    }
}