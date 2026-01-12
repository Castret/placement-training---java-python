
class MM{
    public static void main(String[] a){
        int[][] x={{1,2},{3,4}};
        int[][] y={{2,0},{1,2}};
        int[][] r=new int[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<2;k++)
                    r[i][j]+=x[i][k]*y[k][j];
        for(int[] i:r){
            for(int j:i)System.out.print(j+" ");
            System.out.println();
        }
    }
}