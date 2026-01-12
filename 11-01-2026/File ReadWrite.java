
import java.io.*;
class FH{
    public static void main(String[] a)throws Exception{
        FileWriter w=new FileWriter("a.txt");
        w.write("Hello"); w.close();
        BufferedReader r=new BufferedReader(new FileReader("a.txt"));
        System.out.println(r.readLine());
        r.close();
    }
}