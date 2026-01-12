
class MA{
    public static void main(String[] a){
        int[][] x={{1,2},{3,4}};
        int[][] y={{5,6},{7,8}};
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print((x[i][j]+y[i][j])+" ");
            System.out.println();
        }
    }
}