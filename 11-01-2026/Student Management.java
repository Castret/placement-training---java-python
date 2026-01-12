class Student{
    int id; String n; int m;
    Student(int i,String n,int m){this.id=i;this.n=n;this.m=m;}
    String g(){return m>=50?"Pass":"Fail";}
    public static void main(String[] a){
        Student s=new Student(1,"A",78);
        System.out.println(s.id+" "+s.n+" "+s.g());
    }
}
