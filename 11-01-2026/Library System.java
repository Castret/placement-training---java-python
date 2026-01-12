
import java.util.*;
class Lib{
    public static void main(String[] a){
        ArrayList<String> l=new ArrayList<>();
        l.add("Java"); l.add("Python");
        l.remove("Java");
        System.out.println(l.contains("Python"));
    }
}