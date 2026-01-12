
class EH{
    public static void main(String[] a){
        try{
            int x=10/0;
        }catch(Exception e){
            System.out.println("Err");
        }finally{
            System.out.println("End");
        }
    }
}